package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme15 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a,b;
	System.out.println("enter first value");
	a=s.nextInt();
	System.out.println("enter second value");
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);
}
}

