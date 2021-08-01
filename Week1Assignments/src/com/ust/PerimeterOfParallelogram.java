package com.ust;

public class PerimeterOfParallelogram {
	public double findPerimeter() {
		double side1=12;
		double side2=10;
		System.out.println("side1 :"+side1);
		System.out.println("side2 :"+side2);

		double peri = 2*(side1+side2);
		return peri;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerimeterOfParallelogram peri = new PerimeterOfParallelogram();
		double result = peri.findPerimeter();
		System.out.println("Perimeter of Parallelogram is "+result);

	}

}
