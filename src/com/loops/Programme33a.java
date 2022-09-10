package com.loops;//Display all digits seprately

import java.util.Scanner;

public class Programme33a {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int num=s.nextInt();
	int rem=0;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		System.out.println(rem);
	}
}
}
