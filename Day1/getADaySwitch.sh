#Switch Case
#!/bin/bash
echo "Enter A Number"
read day

num=$(( day%7 ))

case $num in 
	"1")
		echo -n "Sunday"
		;;
	
	"2")
		echo -n "Monday"
		;;
	
	"3")
		echo -n "Tuesday"
		;;
	
	"4")
		echo -n "Wednesday"
		;;
	
	"5")
		echo -n "Thursday"
		;;
	
	"6")
		echo -n "Friday"
		;;
	
	"7")
		echo -n "Saturday"
		;;
	
	
	*)
		echo "Inavlid"
		;;
esac