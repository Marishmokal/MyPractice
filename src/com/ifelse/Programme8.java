package com.ifelse;

import java.util.Scanner;

public class Programme8 {
public static void main(String[] args) {
	int age,experience,marks;
	Scanner s=new Scanner(System.in);
	System.out.println("enter age");
	age=s.nextInt();
	System.out.println("enter experiance");
	experience=s.nextInt();
	System.out.println("enter marks");
	marks=s.nextInt();
	if(age>40 && experience>=10 && marks>60)
	{
		System.out.println("eligible driver");
	}
	else
	{
		System.out.println("not eligible driver");
	}
}
}
