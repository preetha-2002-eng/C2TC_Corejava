package com.tnsif.daythree;

import com.cg.dayfour.encapsultion.Encapsule;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		c.display();
		Student s1=new Student(1,"Ravi");
		s1.display();
		System.out.println("-----ENCAPSULATION-----");
		Encapsule obj=new Encapsule();
		obj.setName("Raj");		
		obj.setId(1001);
		obj.setMailid("raj@gmail.com");
		obj.setMobile(978347865);
		System.out.println(obj.toString());
	}

}
