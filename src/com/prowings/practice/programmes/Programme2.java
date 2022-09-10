package com.prowings.practice.programmes;

public class Programme2 
{
public static void main(String[] args) 
{
	addition(10,20);
	multiplication(5,5);
	substraction(10,4);
	division(10,5);
	reminder(10);
}
public static int addition(int x,int y)
{
int z;
z=x+y;
System.out.println("addition is:-"+z);
return z;
}
public static int multiplication(int x,int y)
{
	int z;
	z=x*y;
	System.out.println("multiplication is:"+z);		
	return z;
}
public static int substraction(int x,int y)
{
	int z;
	z=x-y;
	System.out.println("substraction is:-"+z);
	return z;
}
public static int division(int x,int y)
{
	int z;
	z=x/y;
	System.out.println("division is:-"+z);
	return z;
}
public static int reminder(int x)
{
	int z;
	z=x%2;
	System.out.println("reminder is:-"+z);
	return z;
}
}

