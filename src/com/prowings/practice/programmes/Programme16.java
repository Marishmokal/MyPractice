package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme16 {
public static void main(String[] args) {
	int x,y,z;
	Scanner s =new Scanner(System.in);
	System.out.println("enter value of X");
	x=s.nextInt();
	System.out.println("enter value of Y");
	y=s.nextInt();
	z=4*x*x+5*y*y*y/2*x*y;
	System.out.println("value of Z:-"+z);
	
}
}
