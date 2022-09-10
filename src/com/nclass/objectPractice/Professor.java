package com.nclass.objectPractice;

import java.util.Scanner;

public class Professor {
int id;
String nm;
String dp;
int exp;
String qul;

void show()
{
	Scanner s =new Scanner(System.in);
	System.out.println("enter id,name,department,experiance,qulification");
	id=s.nextInt();
	nm=s.next();
	dp=s.next();
	exp=s.nextInt();
	qul=s.next();
}
void display()
{
	System.out.println("id no is:-"+id);
	System.out.println("name is:-"+nm);
	System.out.println("department is:-"+dp);
	System.out.println("experiance is:-"+exp);
	System.out.println("qulification is:-"+qul);
}
public static void main(String args[])
{
	Professor p=new Professor();
	
	p.show();
	
	p.display();
}

}
