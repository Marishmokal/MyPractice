package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int loanAmt, interestAmt, totalAmt;
		System.out.println("enter loan amount");
		loanAmt = s.nextInt();
		interestAmt = loanAmt+12 / 100 * 12;
		System.out.println("interest amount:-" + interestAmt);
		totalAmt = loanAmt + interestAmt;
		System.out.println("TOTAL AMOUNT:-" + totalAmt);
	}
}
