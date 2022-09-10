package com.arrays.practice;//find cube

import java.util.Scanner;

public class Programme6 {
public static void main(String[] args) {
	int[]x=new int[5];
	
	int cube=1;
	Scanner s =new Scanner(System.in);
	for(int i=0;i<x.length;i++)
	{
		System.out.println("enter any number");
		x[i]=s.nextInt();
	}
	for(int i=0;i<x.length;i++)
	{
		cube=x[i]*x[i]*x[i];
	
		System.out.println(cube);
	}
}
}
