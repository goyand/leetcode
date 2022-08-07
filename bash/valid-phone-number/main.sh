#!/bin/bash

cat file.txt | grep -E "^(\([0-9]{3}\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$"
grep -E '^(\d{3}-|\(\d{3}\)\s)\d{3}-\d{4}$' file.txt
