package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme10 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	double base,height,area;
	System.out.println("enter base of triangle");
	base=s.nextDouble();
	System.out.println("enter heght of triangle");
	height=s.nextDouble();
	area=0.5*base*height;
	System.out.println("area of triangle:-"+area);
	
}
}
