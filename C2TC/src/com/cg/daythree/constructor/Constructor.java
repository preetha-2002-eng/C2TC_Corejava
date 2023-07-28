package com.cg.daythree.constructor;

class Constructor {
	int id;
	String name;
//	 Constructor(){
//		 System.out.println("Default constructor...");
//	 }
	 void display() {
		 System.out.println(id+" "+name);
	 }
}
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
	    this.name=name;
	}
	void display() {
		System.out.println("the student id is "+id+" and the student name is "+name);
	}
}
