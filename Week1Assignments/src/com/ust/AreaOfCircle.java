package com.ust;

import java.util.Scanner;

public class AreaOfCircle {
	
	public  double findArea(double r) {
		double area = 3.14*r*r;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the radius :");
		double r = scanner.nextDouble();
		
		AreaOfCircle area = new AreaOfCircle();
		
		double result = area.findArea(r);
		System.out.println("Area of Circle is "+result);
	}

}
