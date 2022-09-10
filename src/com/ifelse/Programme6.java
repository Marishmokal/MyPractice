package com.ifelse;

import java.util.Scanner;

public class Programme6 {
public static void main(String[] args) {
	int num;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	if(num%2==0)
	{
		System.out.println("even number");
	}
	else 
		System.out.println("odd number");
}
}
