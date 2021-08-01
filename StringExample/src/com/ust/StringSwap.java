package com.ust;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two string :");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		string1=string1+string2;
		string2=string1.substring(0, (string1.length()-string2.length()));
		string1=string1.substring(string2.length());
		scanner.close();
		System.out.println(string1);
		System.out.println(string2);


	}

}
