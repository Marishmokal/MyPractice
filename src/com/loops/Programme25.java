package com.loops;//accept any number and calculate addition of digits

import java.util.Scanner;

public class Programme25 {
public static void main(String[] args) {
	int num,sum=0,r;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;num!=0;i++)
	{
		r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.println("addition is:-"+sum);
}
}
