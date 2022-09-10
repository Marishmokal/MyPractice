package com.loops;

import java.util.Scanner;

public class Programme18 {
public static void main(String[] args) {
	int n1,n2,n3,n4,num;
	Scanner s =new Scanner(System.in);
	System.out.println("enter 1st number");
	n1=s.nextInt();
	System.out.println("enter 2nd number");
	n2=s.nextInt();
	System.out.println("enter 3rd number");
	n3=s.nextInt();
	System.out.println("enter 4th number");
	n4=s.nextInt();
	System.out.println("enter 5th num");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
	}
}
}
