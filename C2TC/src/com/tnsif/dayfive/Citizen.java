package com.tnsif.dayfive;

public class Citizen {
	String name;
	String city;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
class Student extends Citizen{
	int  id;
	String dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	void display() {
		System.out.println(id+" "+name+" "+dept+" "+city);
	}
}
class Country{
	String c_name;
	int c_code;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_code() {
		return c_code;
	}
	public void setC_code(int c_code) {
		this.c_code = c_code;
	}
}
class State extends Country{
	String s_name;
	int s_code;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_code() {
		return s_code;
	}
	public void setS_code(int s_code) {
		this.s_code = s_code;
	}
}
class City extends State{
	String name;
	int pin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	void display(){
		System.out.println(c_name+" "+c_code+" "+s_name+" "+s_code+" "+name+" "+pin);
	}
}
class People{
	String name;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
class Pupil extends People{
	int id;
	String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	void display() {
		System.out.println(id+" "+name+" "+dept+" "+city);
	}
}
class Employee extends People{
	int id;
	String specification;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	void display() {
		System.out.println(id+" "+name+" "+specification+" "+city);
	}
}