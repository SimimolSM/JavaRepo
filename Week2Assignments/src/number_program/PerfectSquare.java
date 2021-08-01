package number_program;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		double num = scanner.nextDouble();
		scanner.close();
		double root = Math.sqrt(num);

		if(root%1==0)

		{

		System.out.println("Perfect Square");

		}

		else {

			System.out.println("Not a Perfect Square");

		}

	}

}
