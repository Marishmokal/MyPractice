package com.switchcase;

import java.util.Scanner;

public class Programme2 {
public static void main(String[] args) {
	String name;
	Scanner s=new Scanner(System.in);
	System.out.println("enter name and model of bike");
	name=s.next();
	switch(name)
	{
	case "TVS jupiter":
		System.out.println(" ON ROAD PRICE:-69576 TO 83746/-"
				+ "TVS Jupiter BS-VI with ETFi technology (Eco Thrust Fuel injection) is powered by a 109.7 cc air-cooled engine which produces 8.4 Nm of power. With advanced ETFi technology, you get 15% more mileage with smooth ride quality. It has a fuel tank of 6 L and the largest wheelbase of 1275 mm in the industry along with best-in-class 1-step external fuel fill system");
		break;
		
	case  "TVS jupiter 125":
		System.out.println("ON ROAD PRICE:-79775 TO 86775"
				+ "The TVS Jupiter 125 is powered by a 124.8 cc air-cooled engine which produces of power. It has a fuel tank of 5.1 l and a . The TVS Jupiter 125 starts at Rs 79,775 and goes up to Rs 86,675 (ex-showroom, Delhi). It is available in three variants.");
	break;
	
	case "TVS NTORQ 125":
		System.out.println("ON ROAD PRICE:-93451 TO 1.15LAKH"
				+ "The TVS NTORQ 125 is powered by a 124.8 cc air-cooled engine which produces of power. It has a fuel tank of 5.8 L and a .");
	break;
	
	case "TVS Raider":
		System.out.println("ON ROAD PRICE:-84573 TO 92089"
				+ "The TVS Raider is powered by a 124.8 cc air-cooled engine which produces of power. It has a fuel tank of 10 L and a .");
	break;
	
	case "TVS Readeon":
		System.out.println("ON ROAD PRICE:-71919 TO 91484"
				+ "The TVS Radeon is powered by a 109.7 cc air-cooled engine which produces of power. It has a fuel tank of 10 L and a .");
	break;
	
	case "TVS Scooty zest":
		System.out.println("ON ROAD PRICE:-82181 TO 84018"
				+ "The TVS Scooty Zest is powered by a 109.7 cc air-cooled engine which produces of power. It has a fuel tank of 5 L and a .");
	break;
	
	case "TVS Sport":
		System.out.println("ON ROAD PRICE:-77440 TO 81266"
				+ "The TVS Sport is powered by a 109.7 cc air-cooled engine which produces of power. It has a fuel tank of 10 L and a .");
	break;
	
	case "TVS Scooty pep plus":
		System.out.println("ON ROAD PRICE:-7460 TO 77806"
				+ "The TVS Scooty Pep Plus is powered by a 87.8 cc air-cooled engine which produces of power. It has a fuel tank of 4.2 L and a .");
	break;
	}
	
	
	
	
}
}
