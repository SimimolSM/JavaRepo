package com.ust;

public class CSAOfCube {

	public double findSurfaceArea() {
		double side = 9.7;
		System.out.println("side : "+side);
		double surfacearea = 6*side*side;
		return surfacearea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSAOfCube cube = new CSAOfCube();
		double result = cube.findSurfaceArea();
		System.out.println("Curved Surfae Area of Cube is "+result);

	}


}
