package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme8 {
public static void main(String[] args) {
	double r,area, circumference;
	double pi=3.14;
	Scanner m=new Scanner(System.in);
	System.out.println("enter readius of circle");
	r=m.nextInt();
	area=pi*r*r;
	System.out.println("area of circle:-"+area);
	circumference=2*pi*r;
	System.out.println("circumference is:"+circumference);
	
}
}
