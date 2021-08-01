package com.ust;

import java.util.Scanner;

public class StringOperations {
	
	public static String concat(String str1,String str2) {
		String str3=str1 + str2;
		return str3;
	}
	public static String repeat(String str1,String str2) {
		String str3=str1 + str2;
		return str3.repeat(2);
	}
	
	public static String replace(String str1,String str2) {
		String str3="";
		if(str1.contains("a") || str2.contains("a")) {
			 str3=str1.replace("a", "@");
		}
		else {
			System.out.println("Nothing to replace");
		}
		
		return str3;
	}
	
	public static String lowCase(String str1,String str2) {
		String str3=str1 + str2;
		return str3.toLowerCase();
	}
	
	public static String uppCase(String str1,String str2) {
		String str3=str1 + str2;
		return str3.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter two string :");
	    String string1 = scanner.nextLine();
	    String string2 = scanner.nextLine();

	    System.out.println("Concatinated :"+concat(string1,string2));
	    System.out.println("Repeated :"+repeat(string1,string2));
	    System.out.println("Lowercase :"+lowCase(string1,string2));
	    System.out.println("Uppercase :"+uppCase(string1,string2));
	    System.out.println(replace(string1,string2));



		
	}

}
