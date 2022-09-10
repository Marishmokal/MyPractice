package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme11 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int billAmt,gstAmt,netAmt;
	System.out.println("enter bill amount");
	billAmt=s.nextInt();
	gstAmt=billAmt*18/100;
	System.out.println("total gst amount:-"+gstAmt);
	netAmt=billAmt+gstAmt;
	System.out.println("Net Amount:-"+netAmt);
}
}
