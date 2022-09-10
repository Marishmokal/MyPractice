package com.arrays.practice;

import java.util.Scanner;

public class Programme12 {
public static void main(String[] args) {
	int[]x= {20,12};
	int num=0;
	Scanner s=new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		num=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==num)
		{
			System.out.println("present in array");
		}
		else
			System.out.println("not present in array");
	}
}
}
