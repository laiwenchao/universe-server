#! /bin/sh

# ------------------------------------
# default args
# ------------------------------------
WEB_APP="haina-ocs-web"
JACOCO_ARGS=${JACOCO_ARGS}
CUSTOM_JVM_OFFLINE=" -Xmx2048m
             -Xms2048m
             -XX:MaxPermSize=512m
             -Xmn756m
             -XX:+UseConcMarkSweepGC
             -XX:+UseParNewGC
             -XX:+HeapDumpOnOutOfMemoryError
             -XX:+PrintGCDetails
             -XX:+PrintGCDateStamps
             -Xloggc:logs/gc.log
             -Dspring.profiles.active=dev
             -Dorg.jboss.logging.provider=slf4j
             -agentlib:jdwp=transport=dt_socket,address=8088,suspend=n,server=y"
CUSTOM_LOG_PATH_OFFLINE="/opt/logs/wwwlogs"


CUSTOM_JVM_ONLINE=" -Xmx4048m
             -Xms4048m
             -XX:MaxPermSize=512m
             -Xmn1512m
             -XX:+UseConcMarkSweepGC
             -XX:+UseParNewGC
             -XX:+HeapDumpOnOutOfMemoryError
             -XX:+PrintGCDetails
             -XX:+PrintGCDateStamps
             -Xloggc:logs/gc.log
             -Dspring.profiles.active=prod
             -Dorg.jboss.logging.provider=slf4j"
CUSTOM_LOG_PATH_ONLINE="/opt/logs/wwwlogs"


# ------------------------------------
# do not edit
# ------------------------------------
# 根据主机名区分线上线下环境
function is_online() {
   ENV_STR=`fgrep -w 'deployenv' /opt/server/apps/appenv`
   if [[ ${ENV_STR} =~ "product" ]] || [[ ${ENV_STR} =~ "staging" ]]; then
       echo true
   else
       echo false
   fi
}

function init() {
    PID_NUM=$(ps aux |grep "${WEB_APP}\.jar"|grep -v "grep"|awk '{print $2}')
    echo ${PID_NUM}
    if [ ${PID_NUM} ] ; then
        echo kill ${WEB_APP}.jar
        kill  ${PID_NUM}

    	echo sleep 10
    	sleep 10

        PID_NUM=$(ps aux |grep "${WEB_APP}\.jar"|grep -v "grep"|awk '{print $2}')
    	if [ ${PID_NUM} ] ; then
        	echo kill -9 ${WEB_APP}.jar
       		kill -9 ${PID_NUM}
       	fi
    else
            echo ${WEB_APP}.jar not running
    fi
}


function run() {
    echo starting...

    if [ -d "logs" ]; then
    	echo rm logs
    	rm -rf logs
    fi

    # 根据主机名判断是否是线上环境
    IS_ONLINE=`is_online`
    echo "IS_ONLINE:"${IS_ONLINE}

    # 环境设置
    if [ ${IS_ONLINE} = "true" ]; then
        CUSTOM_JVM=${CUSTOM_JVM_ONLINE}
        ln -s ${CUSTOM_LOG_PATH_ONLINE} logs
    else
		CUSTOM_JVM="${CUSTOM_JVM_OFFLINE} ${JACOCO_ARGS}"
        ln -s ${CUSTOM_LOG_PATH_OFFLINE} logs
    fi

    exec /usr/local/`ls /usr/local/ |grep java8`/bin/java ${CUSTOM_JVM} -jar ${WEB_APP}.jar > output.log 2>&1

    echo run finished
}


# ------------------------------------
# actually work
# ------------------------------------
init
run
