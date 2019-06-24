#!/bin/bash
echo $1> ./props.txt
crontab ./props.txt