package com.nclass.objectPractice;

import java.util.Scanner;

public class Bank {
long accNo;
String nm;
String At;
double Amt;

void show()
{
	Scanner s =new Scanner(System.in);
	System.out.println("enter accNo,name,AccountType,Amount");
	accNo=s.nextLong();
	nm=s.next();
	At=s.next();
	Amt=s.nextDouble();
}
void present()
{
	System.out.println("Account number is:-"+accNo);
	System.out.println("Account holder name:-"+nm);
	System.out.println("Account Type:-"+At);
	System.out.println("Account available:-"+Amt);
}
public static void main(String args[])
{
	Bank b =new Bank();
	
	b.show();
	
	b.present();
}
}
