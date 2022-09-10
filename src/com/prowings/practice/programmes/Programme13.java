package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme13 {
public static void main(String[] args) {
	int basicSal,HRA,TA,DA,MA,PF,netSal;
	Scanner s =new Scanner(System.in);
	System.out.println("enter salary of employee");
	basicSal=s.nextInt();
	HRA=basicSal*45/100;
	TA=basicSal*25/100;
	DA=basicSal*30/100;
	MA=basicSal-25/100;
	PF=basicSal-5/100;
	netSal=HRA+TA+DA+MA+PF;
	System.out.println("total salary:-"+netSal);
	
	
}
}
