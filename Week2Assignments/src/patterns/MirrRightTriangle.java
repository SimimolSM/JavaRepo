package patterns;

import java.util.Scanner;

public class MirrRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
		sc.close();

		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}  
		
		
		
		

	}

}
