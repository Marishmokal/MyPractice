package com.ifelse;

import java.util.Scanner;

public class Programme3 {
public static void main(String[] args) {
	double marks;
	Scanner s =new Scanner(System.in);
	System.out.println("enter marks");
	marks=s.nextDouble();
	if(marks>35 && marks<=100)
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
}
}
