package com.ust;

public class IsoTriangleArea {
	//method to find area of isosceles triangle
		public double findArea(double base,double height) {
			double b= base;
			double h = height;
			System.out.println("base :"+base);
			System.out.println("height :"+height);

			double area = 0.5*(b*h);
			return area;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsoTriangleArea iso = new IsoTriangleArea();
		double result = iso.findArea(2, 4);
		System.out.println("Area of Triangle is "+result);
	}

}
