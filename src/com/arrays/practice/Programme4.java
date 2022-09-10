package com.arrays.practice;

import java.util.Scanner;

public class Programme4 {
public static void main(String[] args) {
	int[]x=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
	}
	for(int i=x.length-1;i>=0;i--)
	{
		System.out.println(x[i]);
	}
	
}
}
