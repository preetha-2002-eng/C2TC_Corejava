package com.tnsif.dayfive;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----SINGLE INHERITANCE-----");
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Ravi");
		s1.setDept("CSE");
		s1.setCity("Villupuram");
		s1.display();
		System.out.println("-----MULTILEVEL INHERITANCE-----");
		City c1=new City();
		c1.setC_code(10);
		c1.setC_name("India");
		c1.setS_code(20);
		c1.setS_name("TamilNadu");
		c1.setName("Villupuram");
		c1.setPin(605106);
		c1.display();
		System.out.println("-----HEIRARCHICAL INHERITANCE-----");
		Employee e1=new Employee();
		e1.setCity("Chennai");
		e1.setId(101);
		e1.setName("Raghu");
		e1.setSpecification("Manager");
		e1.display();
	}

}
