package com.ust;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
		sc.close();
		for (int i = 1; i<=n ; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );


	}

}
