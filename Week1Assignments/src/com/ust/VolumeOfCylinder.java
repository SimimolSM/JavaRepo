package com.ust;

public class VolumeOfCylinder {
	
	public static double findVolume(double radius, double height) {
		double r = radius;
		double h = height;
		System.out.println("Radius : "+radius);
		System.out.println("Height : "+height);
		double volume = 3.14*r*r*h;
		System.out.println("Volume of Cylinder is "+volume);
		return volume;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findVolume(3.5, 7);
	}

}
