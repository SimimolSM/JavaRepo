package com.ust;

import static java.lang.Math.*; 

public class QuadraticEquation {
	
	//method to find and display roots of a quadratic equation
	public void findRoot(int a,int b,int c) {
		System.out.println(a+"x^2+"+b+"x+"+c);
		double d = (b*b)-4*a*c;
		double r =-b/2*a;
		double x1 = r+sqrt(d);
		double x2 = r-sqrt(d);
			
		if (d==0) {
			System.out.println("Roots are real and same \n"+x1+" and "+x2);
		}
		else if (d>0) {
			System.out.println("Roots are real and different \n"+x1+" and "+x2);	
		}
		else {
			System.out.println("Roots are imaginary and unequal \n");		}
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticEquation eqn = new QuadraticEquation();
		eqn.findRoot(1, 2, 1);
			
		

	}

}
