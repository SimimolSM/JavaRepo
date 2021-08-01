package com.ust;

public class MethodOverloading {

public double add(double num1, double num2) {
	
	double  res=num1+num2;
	System.out.println("Addition of 2 inputs :"+res);
	return res;
	
}
public double add(double num1, double num2,double num3) {
	
	double  res=num1+num2+num3;
	System.out.println("Addition of 3 inputs :"+res);
	return res;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mtd = new MethodOverloading();
		mtd.add(2, 3, 4);
		mtd.add(6, 7);

	}

}
