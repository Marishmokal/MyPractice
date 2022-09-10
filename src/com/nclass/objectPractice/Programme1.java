package com.nclass.objectPractice;//student class

import java.util.Scanner;

public class Programme1
{
	int r;
	String nm;
	int m;
	String br;
	
	void accept()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter rollNo,name,marks,branch");
		r=s.nextInt();
		nm=s.next();
		m=s.nextInt();
		br=s.next();
	}
	void display()
	{
		System.out.println("rollNo is:-"+r);
		System.out.println("name is:-"+nm);
		System.out.println("marks are:-"+m);
		System.out.println("branch is:-"+br);
	}
	public static void main(String args[])
	{
		Programme1 p=new Programme1();
		Programme1 q=new Programme1();
		Programme1 r=new Programme1();
		
		p.accept();
		q.accept();
		r.accept();
		
		p.display();
		q.display();
		r.display();
		
	}
}
