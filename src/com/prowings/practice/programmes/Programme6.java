package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme6 {
public static void main(String[] args) {
	int sub1,sub2,sub3,sub4,sub5,totalMarks,average;
	Scanner m=new Scanner(System.in);
	System.out.println("enter first subject marks");
	sub1=m.nextInt();
	System.out.println("enter second subject marks");
	sub2=m.nextInt();
	System.out.println("enter third subject marks");
	sub3=m.nextInt();
	System.out.println("enter fourth subject marks");
	sub4=m.nextInt();
	System.out.println("enter fifth subject marks");
	sub5=m.nextInt();
	totalMarks=sub1+sub2+sub3+sub4+sub5;
	System.out.println("TOTAL OF MARKS:-"+totalMarks);
	average=totalMarks/5;
	System.out.println("average is:-"+average);
}
}
