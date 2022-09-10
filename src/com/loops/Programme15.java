package com.loops;//ACCEPT ANY NUMBER AND DO THE ADDITION UPTO 1

import java.util.Scanner;

public class Programme15 {
public static void main(String[] args) {
	int num;
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
	}
	System.out.println("Addition is:-"+sum);
}
}
