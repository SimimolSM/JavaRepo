package com.ust;

public class PerimeterOfRectangle {

	public double findPerimeter() {
		double length=4;
		double breadth=13;
		System.out.println("lenght :"+length);
		System.out.println("breadth :"+breadth);
		double peri = 2*(length+breadth);
		return peri;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerimeterOfRectangle peri = new PerimeterOfRectangle();
		double result = peri.findPerimeter();
		System.out.println("Perimeter of Rectangle is "+result);

	}

}
