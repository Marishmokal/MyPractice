package com.loops;//reverse number

import java.util.Scanner;

public class Programme19 {
public static void main(String[] args) 
{
	int num;
	int reverse=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=0;num!=0;i++)
	{
		reverse=reverse*10+num%10;
		num=num/10;
	}
	System.out.println(reverse);
	
}
}
