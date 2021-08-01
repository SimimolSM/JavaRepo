package com.ust;
import static java.lang.Math.*;
public class EquiTriangleArea {
	
	public double findArea(double side) {
		double a= side;
		System.out.println("side : "+a);
		double area = (sqrt(3)/4)*a*a;
		return area;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquiTriangleArea equi = new EquiTriangleArea();
	    double result = equi.findArea(4);
		System.out.println("Area of Equilateral Triangle is "+result);
	}

}
