package com.tnsif.dayeight.overriden;

public class Animal {
	void eat()
	{
		System.out.println("Animal eating...");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats meat...");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("Cat drinks milk...");
	}
}