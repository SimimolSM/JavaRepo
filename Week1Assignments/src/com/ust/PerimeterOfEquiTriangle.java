package com.ust;

public class PerimeterOfEquiTriangle {
	public static double findPerimeter(double side) {
		double a = side;
		System.out.println("side :"+a);
		double perimeter = 3*a;
		return perimeter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Equilateral Triangle is "+findPerimeter(3));
	}

}
