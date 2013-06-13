#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

export CLASSPATH="$DIR/../target/lib/*:$DIR/../target/*"
export JAVA_OPTS="${JAVA_OPTS} -XX:MaxPermSize=256M -Xmx1024M -DloggerPath=conf/log4j.properties"
JAVA_OPTS=$JAVA_OPTS scala -cp $CLASSPATH "$@" epages/ep6/EP6JavaGenerator.scala http://dhoppe.intern.epages.de/epages/DemoShop.admin?ViewAction=JSONGetAPI&ObjectPath=/Shops/DemoShop
