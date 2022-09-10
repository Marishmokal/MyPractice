package com.practicebreak.pcontinue;

public class LabelledContinue {
public static void main(String[] args) {
	int j=0;
	l1:
		for(int i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				if(i==j)
					continue;
			}
			System.out.println(i+"..."+j);
			
		}
}
}
