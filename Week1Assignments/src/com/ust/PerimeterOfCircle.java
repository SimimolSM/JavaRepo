package com.ust;

public class PerimeterOfCircle {
	public  double findPerimeter(double radius) {
		double r= radius;
		System.out.println("Radius :"+r);
		double perimeter = 2*3.14*r;
		return perimeter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerimeterOfCircle peri = new PerimeterOfCircle();
		System.out.println("Perimeter of Circle is "+peri.findPerimeter(2));
	}

}
