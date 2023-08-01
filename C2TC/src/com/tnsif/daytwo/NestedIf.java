package com.tnsif.daytwo;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		if(a%2!=0) {
			if(a>10) {
				System.out.println("Odd Greater");
			}
			else {
				System.out.println("Odd Smaller");
			}
		}
	}

}
