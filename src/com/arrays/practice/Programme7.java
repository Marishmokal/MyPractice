package com.arrays.practice;//find cube and stored into another array

import java.util.Scanner;

public class Programme7 {
public static void main(String[] args) {
	int cube=1;
	int[]x=new int[5];
	int[]b=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
		
	}
	for(int i=1;i<x.length;i++)
	{
		cube=x[i]*x[i]*x[i];
		b[i]=cube;
		System.out.println(b[i]);
	}
}
}
