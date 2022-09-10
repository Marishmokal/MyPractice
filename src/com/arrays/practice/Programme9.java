package com.arrays.practice;//Display negative and positive numbers

import java.util.Scanner;

public class Programme9 {
public static void main(String[] args) {
	int[]x=new int[5];
	Scanner s =new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
	if(x[i]>0)
	{
		System.out.println("positive number"+x[i]);
	}
	else
		System.out.println("negative number"+x[i]);
}
}
}