package com.ust;

public class ArithmeticOperation {
	public static void add(double num1,double num2) {
		double x=num1;
		double y=num2;
		double res=x+y;
		System.out.println("Sum :"+res);
		
	}
	public static void sub(double num1,double num2) {
		double x=num1;
		double y=num2;
		double res=x-y;
		System.out.println("Difference :"+res);
		
	}
	public static void mult(double num1,double num2) {
		double x=num1;
		double y=num2;
		double res=x*y;
		System.out.println("Multiplication :"+res);
		
	}
	public static void div(double num1,double num2) {
		double x=num1;
		double y=num2;
		double res=x/y;
		System.out.println("Division :"+res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=12;
		double num2=7;
		add(num1, num2);
		sub(num1, num2);
		mult(num1, num2);
		div(num1, num2);

	}

}
