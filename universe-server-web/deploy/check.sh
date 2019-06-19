#! /bin/sh
# ------------------------------------
# default args
# ------------------------------------
CHECK_PORT_OFFLINE=8020

CHECK_PORT_ONLINE=8010


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

function check() {
    # 根据主机名判断是否是线上环境
    IS_ONLINE=`is_online`
    echo "IS_ONLINE:"${IS_ONLINE}

    # 端口设置
    if [ ${IS_ONLINE} = "true" ]; then
        CHECK_PORT=${CHECK_PORT_ONLINE}
    else
        CHECK_PORT=${CHECK_PORT_OFFLINE}
    fi

    TEST_URL="http://localhost:${CHECK_PORT}/health"

    STATUS_CODE=`curl -o /dev/null -s -w %{http_code} ${TEST_URL}`

    if [ ${STATUS_CODE} = "200" ];then
        echo "request test_url:${TEST_URL} succeeded!"
        echo "response code:${STATUS_CODE}"
        exit 0;
    else
        echo "request test_url:${TEST_URL} failed!"
        echo "response code: ${STATUS_CODE}"
        exit -1;
    fi
}


# ------------------------------------
# actually work
# ------------------------------------
check