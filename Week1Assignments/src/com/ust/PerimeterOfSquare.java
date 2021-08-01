package com.ust;

public class PerimeterOfSquare {
	public double findPerimeter() {
		double side = 25;
		System.out.println("side : "+side);
		double peri = 4*side;
		return peri;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerimeterOfSquare objOfSquare = new PerimeterOfSquare();
		double result = objOfSquare.findPerimeter();
		System.out.println("Perimeter of Square is "+result);

	}

}
