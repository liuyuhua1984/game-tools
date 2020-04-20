title apk-tools
@echo off
set JAVA=java 
set jar=oss-txt-1.0.0.jar
set MAIN=com.lyh.tools.OssTxtApp
set libs=./lib/*
set inpuPath=../app.apk 
set outputPath=../
set allPackage=1
set log=./logs
set keyFlag=1
#nohup "$JAVA" -cp "$libs":"$jar" "$MAIN" ${SID} ./ ${log} -Dfile.encoding=UTF-8 >log.txt 2>&1 &
set r_host=127.0.0.1
set r_port=10002

%JAVA% -server -Xms1024m -Xmx1024m -Xmn200m -Xss256k -Xnoclassgc -XX:+ExplicitGCInvokesConcurrent -XX:+AggressiveOpts -XX:+UseParNewGC -XX:ParallelGCThreads=8 -XX:+UseConcMarkSweepGC -XX:ParallelCMSThreads=8 -XX:+UseFastAccessorMethods -XX:+CMSParallelRemarkEnabled -XX:+UseCMSCompactAtFullCollection -XX:CMSFullGCsBeforeCompaction=0 -XX:+UseBiasedLocking -XX:CMSInitiatingOccupancyFraction=70 -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+PrintClassHistogram -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintTenuringDistribution -Xloggc:log/gc.log -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -cp %libs%;%jar% %MAIN% -Dfile.encoding=UTF-8 >log.txt 2>&1 &

pause