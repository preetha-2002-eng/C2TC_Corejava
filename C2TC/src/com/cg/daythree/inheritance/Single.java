package com.cg.daythree.inheritance;

public class Single {
	void parent() {
		System.out.println("This is parent class");
	}
}
class Child extends Single{
	void child() {
		System.out.println("This is Child class");
	}
}
class ClassA{
	void sum(int a,int b) {
		System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
	}
}
class ClassB extends ClassA{
	void sub(int a,int b) {
		System.out.println("The sub of "+a+" and "+b+" is "+(a-b));
	}
}
class ClassC extends ClassB{
	void mul(int a,int b) {
		System.out.println("The multiple of "+a+" and "+b+" is "+(a*b));
	}
}
class Shape {
	void draw() {
		System.out.println("Draw shape...");
	}
}
class Circle extends Shape{
	void cdraw() {
		System.out.println("Draw Circle...");
	}
}
class Rectangle extends Shape{
	void rdraw() {
		System.out.println("Draw Rectangle...");
	}
}