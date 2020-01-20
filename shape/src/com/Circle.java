package com;

public class Circle {
	int radius;
	@Override
	public String toString() {
		return "Circle [radius=" + radius  + "]";
	}

	double pi=3.1415;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double Area() {
		return pi*radius*radius;
	}
}
