package com.tnsif.daysix.usingfinal;

public class FinalMethod {
	final void run() {
		System.out.println("Running...");
	}
}
class Demo extends FinalMethod{
	void eat() {
		System.out.println("Eating...");
	}
}
