package com.prowings.practice.programmes;

import java.util.Scanner;

public class Programme7 {
public static void main(String[] args) {
	int length,bredth,height,volume;
	Scanner m=new Scanner(System.in);
	System.out.println("enter length of box");
	length=m.nextInt();
	System.out.println("enter bredth of box");
	bredth=m.nextInt();
	System.out.println("enter height of box");
	height=m.nextInt();
	volume=length*bredth*height;
	System.out.println("volue of box is:-"+volume);
}
}
