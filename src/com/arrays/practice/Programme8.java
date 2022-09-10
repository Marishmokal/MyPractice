package com.arrays.practice;//copy one array into another array

import java.util.Scanner;

public class Programme8 {
public static void main(String[] args) {
int[]x=new int[5];
int[]b=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<x.length;i++)
{
	System.out.println("enter any number");
	x[i]=s.nextInt();
}
for(int i=0;i<x.length;i++)
{
	b[i]=x[i];
	System.out.println(b[i]);
}
}
}
