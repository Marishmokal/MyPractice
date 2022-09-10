package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme9 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int s1,s2,area;
	System.out.println("enter s1 of rectangle");
	s1=s.nextInt();
	System.out.println("enter s2 of rectangle");
	s2=s.nextInt();
	area=s1*s2;
	System.out.println("area of rectangle:-"+area);
}
}
