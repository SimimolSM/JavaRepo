package com.ust;
import static java.lang.Math.*;
public class AreaOfTriangle {
	
	//method to find area of triangle
	public static void findArea(double side1,double side2,double side3) {
		double a = side1;
		double b = side2;
		double c = side3;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);


		double s = (a+b+c)/2;
		double area = sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is "+area);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findArea(2, 5, 4);
	}

}
