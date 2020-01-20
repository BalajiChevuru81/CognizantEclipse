package com;

public class Squre {
	int s;
	@Override
	public String toString() {
		return "Circle [side =" + s + "]";
	}

	
	public Squre(int s) {
		super();
		this.s = s;
	}
	
	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	public int Area() {
		return s*s;
	}
}
