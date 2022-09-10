package com.ifelse;

import java.util.Scanner;

public class Programme5 {
public static void main(String[] args) {
	int w,x,y,z;
	Scanner s =new Scanner(System.in);
	System.out.println("enter value of w");
	w=s.nextInt();
	System.out.println("enter value of x");
	x=s.nextInt();
	System.out.println("enter value of y");
	y=s.nextInt();
	System.out.println("enter value of z");
	z=s.nextInt();
	if(w<x && w<y && w<z)
	{
		System.out.println("w is smaller number:-"+w);
	}
	else if(x<w && x<y && x<z)
	{
		System.out.println("x is smaller number:-"+x);
	}
	else if(y<w && y<x && y<z)
	{
		System.out.println("y is smaller number");
	}
	else if(z<w && z<x && z<y)
	{
		System.out.println("z is smaller number");
	}
	else
		System.out.println("w x y z are equal");
}
}
