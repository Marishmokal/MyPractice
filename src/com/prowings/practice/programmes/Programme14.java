package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme14 {
public static void main(String[] args) {
	int a,b;
	Scanner s =new Scanner(System.in);
	System.out.println("enter first value");
	a=s.nextInt();
	System.out.println("enter second value");
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("a:-"+a);
	System.out.println("b:-"+b);
}
}
