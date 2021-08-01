package com.ust;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 24;
		if (age < 18) {
			System.out.println("You are Minor."); 
			System.out.println("You are Not Eligible to Work");
		}
		else  {
			if (age >= 18 && age <= 60 )  {
				System.out.println("You are Eligible to Work");
			}
			else  {
				System.out.println("You are too old to work as per the Government rules");
			}
		}

	}

}
