package com.tnsif.daytwo;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Break-----");
		for(int i=1;i<=10;i++) {
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("-----Continue-----");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
