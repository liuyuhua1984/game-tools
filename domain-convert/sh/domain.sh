#!/bin/bash
JAVA=java
jar=domain-convert-1.0.0.jar
MAIN=com.lyh.tools.DomainApp
libs=./lib/*
inpuPath=../app.apk 
outputPath=../
allPackage=1
keyFlag=1
log=./logs
#nohup "$JAVA" -cp "$libs":"$jar" "$MAIN" ${SID} ./ ${log} -Dfile.encoding=UTF-8 >log.txt 2>&1 &
r_host=127.0.0.1
r_port=10002
nohup "$JAVA" -server -Xms1024m -Xmx1024m -Xmn200m -Xss256k -Xnoclassgc -XX:+ExplicitGCInvokesConcurrent -XX:+AggressiveOpts -XX:+UseParNewGC -XX:ParallelGCThreads=8 -XX:+UseConcMarkSweepGC -XX:ParallelCMSThreads=8 -XX:+UseFastAccessorMethods -XX:+CMSParallelRemarkEnabled -XX:+UseCMSCompactAtFullCollection -XX:CMSFullGCsBeforeCompaction=0 -XX:+UseBiasedLocking -XX:CMSInitiatingOccupancyFraction=70 -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+PrintClassHistogram -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintTenuringDistribution -Xloggc:log/gc.log -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -cp "$libs":"$jar" "$MAIN" -Dfile.encoding=UTF-8 >log.txt 2>&1 &


