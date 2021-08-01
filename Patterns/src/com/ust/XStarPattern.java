package com.ust;

import java.util.Scanner;

public class XStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
		sc.close();

		int k=n*2-1;

		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=k;j++)

			{      if(j==i || j==k-i+1)
				System.out.print("*");
			System.out.print(" ");

			}
			System.out.println();
		}            
	}

}
