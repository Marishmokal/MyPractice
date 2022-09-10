package com.loops;//FACTORIAL NUMBER

import java.util.Scanner;

public class Programme16 {
public static void main(String[] args) {
	int num;
	int mul=1;
	Scanner s =new Scanner(System.in);
	System.out.println("enter anu number");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		mul=mul*i;
	}
	System.out.println("factorial is:-"+mul);
}

}
