#!/bin/bash
printf "%-10s%-15s%s\n" "PID"  "OWNER" "COMMAND" "MEMORY"

function sysmon_main(){
RAWIN=$(ps -o pid,user,%mem,command ax |grep -v PID | awk '/[0-9]*/{print $1 ":" $2 ":" $4}')
for i in RAWIN
do
	PID=$(echo $i | cut -d: f1)
	OWNER=$(echo $i | cut -d: f2)
	COMMAND=$(echo $i | cut -d: f3)
	MEMORY=$(ps -o $PID | tail -n 1 | awk  '/[0-9]k {print $2}' )

printf "%-10s%-15s%s\n" "PID"  "OWNER" "COMMAND" "MEMORY"
done
}

sysmon_main | sort  -bnr -k3