package com.tnsif.daytwo;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=70;
		if(mark<50)
		{
			System.out.println("Fail");
		}
		else if(mark>=50 && mark<=60)
		{
			System.out.println("Grade C");
		}
		
		else if(mark>=60 && mark<=70)
		{
			System.out.println("Grade B");
		}
		else
		{
			System.out.println("Grade A");
		}
	}

}
