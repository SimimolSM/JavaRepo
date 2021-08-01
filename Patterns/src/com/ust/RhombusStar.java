package com.ust;

import java.util.Scanner;

public class RhombusStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
		sc.close();
		for(int i=1;i<=n;i++){
			for(int j=0;j<i-1;j++){
				System.out.print(" ");
			}

			for(int j=0;j<n-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}  
	}

}
