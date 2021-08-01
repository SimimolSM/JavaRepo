package com.ust;

import java.util.Scanner;

public class InvRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int n=sc.nextInt();	 
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
	}

}
