package com.practicebreak.pcontinue;//if condition break going to outer loop for ittration and if condition false going for inner loop for ittration

public class LabelledBreak1 {
public static void main(String[] args) {
	int j=0;
	l1:
		for(int i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				if(i==j)
					break;
			}
			System.out.println(i+"."+j);	
		}
	
}
}
