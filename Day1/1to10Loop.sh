#write a script to display number 1 to 10
#!/bin/bash

echo "Enter Number"
read n
for(( i=1;i<=$n;i++ ))
do
	echo $i
done