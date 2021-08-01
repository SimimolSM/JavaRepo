package patterns;

import java.util.Scanner;

public class PyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = scanner.nextInt();
		scanner.close();
		
		for (int i=0; i<n; i++){
			for (int j=i; j<=n; j++){
				// printing spaces
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++ ){

				System.out.print("* ");
			}
			for (int j=1; j<i; j++ ){
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
