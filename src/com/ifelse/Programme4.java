package com.ifelse;

import java.util.Scanner;

public class Programme4 {
public static void main(String[] args) {
	int x,y,z;
	Scanner s =new Scanner(System.in);
	System.out.println("enter value of x");
	x=s.nextInt();
	System.out.println("enter value of y");
	y=s.nextInt();
	System.out.println("enter value of z");
	z=s.nextInt();
	if(x>y && x>z)
	{
		System.out.println("x is largest number:-"+x);
	}
	else if(y>x && y>z)
	{
		System.out.println("y is largest number:-"+y);
	}
	else if(z>x && z>y)
	{
		System.out.println("z is largest number"+z);
	}
	else
		System.out.println("x y z are equal");
}
}
