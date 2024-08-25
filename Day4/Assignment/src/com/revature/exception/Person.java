package com.revature.exception;

public class Person {
private int age;
private String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String eligibleToVote(int age) throws InvalidAgeException{
	if(age>18)
		return "Yes";
	else
		throw new InvalidAgeException();
}
}