package com.loops;//find minimum and maximum digit

import java.util.Scanner;

public class Programme32 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int rem=0;
	int max=num%10;
	int min=num%10;
	while(num>0)
	{
		rem=num%10;
		if(rem<min)
			min=rem;
		else if(rem>max)
			max=rem;
		num=num/10;
	}
	System.out.println("maximum number is:-"+max);
	System.out.println("minimum number is:-"+min);
}
}
