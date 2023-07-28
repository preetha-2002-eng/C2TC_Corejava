package com.cg.daytwo.loopingstmt;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For loop:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);;
		}
		System.out.println("While loop:");
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("Do-While loop:");
		j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=6);
		System.out.println("Break:");
		for(int i=1;i<10;i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Continue:");
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
