package com.ust;

public class TSAOfCylinder {

	public static double findArea(double radius, double height) {
		double r = radius;
		double h = height;
		System.out.println("Radius : "+radius);
		System.out.println("Height : "+height);

		double surfacearea = 2*3.14*r*h;
		System.out.println("Total Surface Area of Cylinder is "+surfacearea);
		return surfacearea;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findArea(5.2, 7.5);
	}


}
