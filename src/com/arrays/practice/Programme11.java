package com.arrays.practice;//find the value that have betweem 80 and 90

import java.util.Scanner;

public class Programme11 {
public static void main(String[] args) {
	int[]x=new int[5];
	int a=0;
	int b=0;
	Scanner s =new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>80 && x[i]<=90)
		{
			a++;
		}
		else
			b++;
	}
	System.out.println("between range"+a++);
	System.out.println("out of range"+b++);
}
}
