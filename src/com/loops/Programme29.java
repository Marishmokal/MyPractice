package com.loops;

import java.util.Scanner;

public class Programme29 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter number");
	int num=s.nextInt();
	for(int i=0;i<=num;i++)
	{
		if(num>0 && num<=5 || num>6 && num<=9)
			System.out.println("between range");
		else
		{
			System.out.println("not in range");
		}
	}
}
}
