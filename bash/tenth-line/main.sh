#!/bin/bash

# head -n 10 file.txt | tail -n 1

sed -n 10P file.txt

# awk 'NR==10' file.txt

# index=0
# while read line; do
# 	index=$((index+1))
# 	if [ $index -eq 10 ]; then
# 	   echo $line
# 	fi
# done < file.txt