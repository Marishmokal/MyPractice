package com.arrays.practice;//count negative and positive numbers

import java.util.Scanner;

public class Programme10 {
public static void main(String[] args) {
	int a=0;
	int b=0;
	int c=0;
	int[]x=new int[5];
	Scanner s =new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any numbers");
		x[i]=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>0)
		{
			a++;
		}
		else if(x[i]<0)
		{
			b++;
		}
		else
			c++;
	}
	System.out.println("positive number:-"+a++);
	System.out.println("negative number:-"+b++);
	System.out.println("zero:-"+c++);
}
}
