package com.loops;//perfect number programme

import java.util.Scanner;

public class Programme30 {
public static void main(String[] args) {
	int sum=0;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	if(num==sum)
	{
		System.out.println("perfect number");
	}
	else
		System.out.println("not perfect number");
	
}
}
