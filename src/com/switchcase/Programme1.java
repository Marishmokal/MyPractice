package com.switchcase;

import java.util.Scanner;

public class Programme1 {
public static void main(String[] args) {
	int num,a,b,c=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of a");
	a=s.nextInt();
	System.out.println("enter value of b");
	b=s.nextInt();
	System.out.println("enter any number");
	num=s.nextInt();
	switch(num)
	{
	case 1:
		c=a+b;
		System.out.println("additions of two digit:-"+c);
		break;
		
	case 2:
		c=a-b;
		System.out.println("substraction of two digit:-"+c);
		break;
		
	case 3:
		c=a*b;
		System.out.println("multiplications of two digit:-"+c);
		break;
	
	case 4:
		c=a/b;
		System.out.println("division of two digit:-"+c);
		break;
		
	case 5:
		c=a%2;
		System.out.println("modulo is:-"+c);
		break;
	}
}
}
