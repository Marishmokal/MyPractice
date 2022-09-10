package com.loops;//positive negative numbers

import java.util.Scanner;

public class Programme28 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter 10 numbers");
	int []arr=new int[10];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<0)
			System.out.println("negative values"+arr[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
			System.out.println("positive values"+arr[i]);
	}
}
}
