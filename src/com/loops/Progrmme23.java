package com.loops;//raise to or power base problem

import java.util.Scanner;

public class Progrmme23 {
public static void main(String[] args) {
	int power,base,result=1;
	Scanner s =new Scanner(System.in);
	System.out.println("enter power");
	power=s.nextInt();
	System.out.println("enter base");
	base=s.nextInt();
	for(int i=1;i<=power;i++)
	{
		result=result*base;
	}
	System.out.println(result);
}
}
