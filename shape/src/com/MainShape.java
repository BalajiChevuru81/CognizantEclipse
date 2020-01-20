package com;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(12,"rectangle",14,8);
		Circle c=new Circle(7);
		Squre b=new Squre(8);
		System.out.println(r);
		System.out.println("Area of rectangle = "+ r.calArea());
		System.out.println(c);
		System.out.println("Area of circle = "+c.Area());
		System.out.println(b);
		System.out.println("Area of Squre = "+b.Area());
	}

}
