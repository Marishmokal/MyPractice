package com.arrays.practice;

import java.util.Scanner;

public class Programme5 {
public static void main(String[] args) {
	int square=1;
	int[]x=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
		square=x[i]*x[i];
		System.out.println(square);
	}
}
}
