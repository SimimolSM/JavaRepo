package com.ust;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 23;
		int b = 16;
		System.out.println("Value of a and b before swapping \na = "+a+"\nb = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Value of a and b after swapping \na = "+a+"\nb = "+b);


	}

}
