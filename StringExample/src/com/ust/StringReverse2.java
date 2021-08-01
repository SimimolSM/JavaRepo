package com.ust;

import java.util.Scanner;

public class StringReverse2 {
	

	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String string = scanner.nextLine();
		scanner.close();
		String result = reverseString(string);
		System.out.println(result);
		if (string==result) {
			System.out.println(" palindrome");
		}
//		else {
//			System.out.println("Not a palindrome");
//		}
//		

		

		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//      System.out.println(StringFormatter.reverseString("my name is khan"));  
//      System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));  
      
//    

}
