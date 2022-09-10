package com.loops;//palindrome number

import java.util.Scanner;

public class Programme20 {
public static void main(String[] args) {
	int num,r,c,palindrome=0;
	Scanner m = new Scanner(System.in);
	System.out.println("enter any number");
	num=m.nextInt();
    c=num;
    while(num>0)
    {
    	palindrome=palindrome*10+num%10;
    	num=num/10;
    }
    if(c==palindrome)
    {
    	System.out.println("palindrome number");
    }
    else
    	System.out.println("not palindrome number");
	
}
}
