package com.loops;//reverse by using while loop

import java.util.Scanner;

public class Programme33c {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int rem=0;
	int rev=0;
	while(num>0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
}
}
