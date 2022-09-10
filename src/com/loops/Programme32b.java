package com.loops;//addition of digits

import java.util.Scanner;

public class Programme32b {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int rem=0;
	int addition=0;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		addition=addition+rem;
	}
	System.out.println("addition is"+addition);
}
}
