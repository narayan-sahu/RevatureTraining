#!/bin/bash
echo "Enter Number One"
read num1
echo "Enter Number two"
read num2
echo "Enter Number three"
read num3

if [[ $num1 -gt $num2 ]]
then
	if [[ $num1 -gt $num3 ]]
	then
		echo $num1 is greatest
	else
		echo $num3 is greatest
	fi
else 
	$num2 is greatest
fi