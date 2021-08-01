package com.ust;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String string = scanner.nextLine();
		scanner.close();
//	
//	   
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr); 
        
       
      
 

	}

}
