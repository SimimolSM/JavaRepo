package com.ust;

public class VolumeOfCone {
	public  void findVolume(double radius, double height) {
		double r = radius;
		double h = height;
		System.out.println("Radius : "+radius);
		System.out.println("Height : "+height);
		double volume = 3.14*r*r*h*1/3;
		System.out.println("Volume of cone is "+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeOfCone cone = new VolumeOfCone();
		cone.findVolume(3, 6);
		

	}

}
