package com.loops;//prime number

import java.util.Scanner;

public class Programme24 {
public static void main(String[] args) {
	int num,count=0;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("prime number");
	}
	else
		System.out.println("not prime number");
	
}
}
