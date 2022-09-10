package com.ifelse;

import java.util.Scanner;

public class Programme1 {
public static void main(String[] args) {
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	if(num>0)
	{
		System.out.println("positive number");
	}
	else
		System.out.println("negative number");
}
}
