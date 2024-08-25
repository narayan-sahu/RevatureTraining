#write a shell script to accept two number and display largest
#!/bin/bash
echo "Enter Number First"
read a
echo "Enter Number Two"
read b
if [[ $a -gt $b ]]
then
{
	echo $a is greater
}
else
{
	echo $b is greater
}
fi

#-gt is an operator used in Bash for numerical comparison. It stands for "greater than." It is used within double square brackets [[ ]] to compare two numbers. Other numerical comparison operators include:
#-lt (less than)
#-eq (equal to)
#-ne (not equal to)
#-ge (greater than or equal to)
#-le (less than or equal to)
#fi is used to close an if block in Bash. It is the reverse of if and is required to signify the end of the if conditional statement.