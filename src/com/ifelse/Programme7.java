package com.ifelse;

import java.util.Scanner;

public class Programme7 {
public static void main(String[] args) {
	int year;
	Scanner s =new Scanner(System.in);
	System.out.println("enter year");
	year=s.nextInt();
	if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not leap year");
	}
}
}
