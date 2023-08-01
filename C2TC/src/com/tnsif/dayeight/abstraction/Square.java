package com.tnsif.dayeight.abstraction;

public class Square extends Shape {
	int side;
	Square(){
		side=8;
	}
	void calArea() {
		System.out.println("Area of square is "+side*side);
	}
}
