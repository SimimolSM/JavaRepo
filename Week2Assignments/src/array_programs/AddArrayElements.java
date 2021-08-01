package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.println("How many numbers you want to enter? ");
		int n = sc.nextInt();
		int [] array = new int[n];
		sc.close();		
		System.out.println("Enter the  numbers : ");

		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
			sum=sum+array[i];

		}

		System.out.println(Arrays.toString(array));


		System.out.println("Sum of elements : "+sum);

	}

}
