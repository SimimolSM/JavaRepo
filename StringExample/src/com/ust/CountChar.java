package com.ust;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String string = scanner.nextLine();
		scanner.close();

		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i)!= ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count); 
        
 


	}

}
