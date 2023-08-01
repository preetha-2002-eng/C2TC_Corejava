package com.tnsif.dayeight.overlodding;

public class ConsOverloading {
	float x,y;
	ConsOverloading(){
		x=0.0f;
		y=0.0f;
	}
	ConsOverloading(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "ConsOverloading [x=" + x + ", y=" + y + "]";
	}
	
}
