package com.ifelse;

import java.util.Scanner;

public class Programme2 {
public static void main(String[] args) {
	int x,y;
	Scanner s=new Scanner(System.in);
	System.out.println("enter x number");
	x=s.nextInt();
	System.out.println("enter y number");
	y=s.nextInt();
	if(x>y)
	{
		System.out.println("greater number");
	}
	else
	{
		System.out.println("smaller number");
	}
}
}
