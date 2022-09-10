package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme4 {
public static void main(String[] args) {
	int n1,n2,n3,mul;
	Scanner m=new Scanner(System.in);
	System.out.println("enter first number");
	n1=m.nextInt();
	System.out.println("enter second number");
	n2=m.nextInt();
	System.out.println("enter third number");
	n3=m.nextInt();
	mul=n1*n2*n3;
	System.out.println("multiplicaton is:-"+mul);
}
}
