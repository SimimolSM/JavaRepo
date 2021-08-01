package basic_program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		  String original, reverse = ""; // Objects of String class  
	      Scanner scanner = new Scanner(System.in);   
	      System.out.println("*******PALINDROME*******\nEnter the string or number");  
	      original = scanner.nextLine();   
	      
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- ) {
	    	  reverse = reverse + original.charAt(i);  
		     	        
	      }
	      if (original.equals(reverse))  {
	    	  System.out.println("Palindrome");  
	      }
	         
	      else {
	    	  System.out.println("Not a Palindrome");  
	      }
	      scanner.close();     

	}
	
	

}
