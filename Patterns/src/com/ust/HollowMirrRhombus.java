package com.ust;

import java.util.Scanner;

public class HollowMirrRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
		sc.close();
	         
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)

			{
				System.out.print(" ");
			}
			if(i==1 || i==n)
				for(int j=1;j<=n;j++)

				{
					System.out.print("*");
				}
			else
			{
				for(int j=1;j<=n;j++)

				{  
					if(j==1 || j==n)
						System.out.print("*");
					else

						System.out.print(" ");
				}
			}
			System.out.println();

		}             

	 

	}

}
