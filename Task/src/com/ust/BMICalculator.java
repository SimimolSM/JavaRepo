package com.ust;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class BMICalculator {
	

	public double findBMI(double height, double weight) {
		double ht = height;
		double wt = weight;
		double bmi = wt/(ht*ht);
		return bmi;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMICalculator bmiCalculator = new BMICalculator();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter gender (M/F): ");
		String gndr = scanner.next();
		System.out.println("Enter age : ");
		double age = scanner.nextDouble();
		System.out.println("Enter weight in Kg : ");
		double wgt = scanner.nextDouble();
		System.out.println("Enter height in meter : ");
		double ht = scanner.nextDouble();
		scanner.close();
		
		double value = bmiCalculator.findBMI(ht, wgt);
		
		switch (gndr.toUpperCase()) {
		case "M":
			if (value<18.5) {
				System.out.println("BMI is "+value);
				System.out.println("Underweight");
				
			}
			else if (value>=18.5 || value<=24.9) {
				System.out.println("BMI is "+value);
				System.out.println("Healthy");
				
			}
			else if (value>=25 || value<=29.9) {
				System.out.println("BMI is "+value);
				System.out.println("Overweight");
			}
			else {
				System.out.println("BMI is "+value);
				System.out.println("Obesity");
			}
			break;
			
		case "F":
			if (value<18.5) {
				System.out.println("BMI is "+value);
				System.out.println("Under Weight");
				
			}
			else if (value>=18.5 || value<=24.9) {
				System.out.println("BMI is "+value);
				System.out.println("Healthy");
				
			}
			else if (value>=25 || value<=29.9) {
				System.out.println("BMI is "+value);
				System.out.println("Over weight");
				
			}
			else {
				System.out.println("BMI is "+value);
				System.out.println("Obesity");
			}
			
			break;
		default:
			System.out.println("Invalid!! Please provide valid gender option");
			break;
		}
		
		
		
		

		


		
		
		

	}

}
