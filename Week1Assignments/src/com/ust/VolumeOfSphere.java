package com.ust;

public class VolumeOfSphere {
	public void findVolume() {
		double r = 2.5;
		System.out.println("Radius : "+r);
		double volume = 3.14*r*r*r*4/3;
		System.out.println("Volume of Sphere is "+volume);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeOfSphere sphere = new VolumeOfSphere();
		sphere.findVolume();

	}

}
