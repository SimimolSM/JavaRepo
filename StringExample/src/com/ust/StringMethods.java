package com.ust;


import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String string = scanner.nextLine();
		scanner.close();
		System.out.println("Space is replaced with a special character : "+string.replace(" ", ""));
		System.out.println("Space removed : "+string.replace(" ", ""));
		int count1=0;
		System.out.println(string.strip());
		for(int i=0;i<string.length();i++) {
			char ch= string.charAt(i);
			if (ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count1++;
			}
		}
		int count2 = string.length()-count1;
		System.out.println("Vowels count : "+count1);
		System.out.println("Constonants count : "+count2);

	}

}
