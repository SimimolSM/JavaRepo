package com.ust;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 5;
		int num3 = 12;
System.out.println("First number :"+num1);
System.out.println("Second number :"+num2);
System.out.println("Third number :"+num3);

		if (num1>num2 && num1>num3) {
			System.out.println("Greatest number is "+num1);
			
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("Greatest number is "+num2);
		}
		else {
			System.out.println("Greatest number is "+num3);
		}
		

	}

}
