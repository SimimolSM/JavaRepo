package com.ust;

import java.util.Scanner;

public class InvPyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows :");
		int n = scanner.nextInt();
		scanner.close();
		for (int i=1; i<=n; i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print("  ");	
			}
			for(int j= i;j<=n;j++) {
				System.out.print("* ");	
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
		
//		
		
		

	}

}
