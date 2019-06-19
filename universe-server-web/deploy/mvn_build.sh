#! /bin/sh
# ------------------------------------
# default args
# ------------------------------------


# ------------------------------------
# do not edit
# ------------------------------------
echo `java -version`
echo `mvn --version`
echo `pwd`
echo 'JAVA_HOME:' ${JAVA_HOME}

ls /usr/local/ |grep jdk
ls /usr/local/ |grep java

export JAVA_HOME=/usr/local/java8
echo 'JAVA_HOME:' ${JAVA_HOME}
echo `mvn --version`

export LANG=en_US.UTF-8

mvn -f ../pom.xml clean package -DskipTests -U  


if [ $? = 1 ]; then
	echo 'package ERROR'
	exit 1
fi