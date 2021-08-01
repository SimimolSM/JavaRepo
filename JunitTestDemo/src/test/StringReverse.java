package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class StringReverse {

	@Test
	public void test() {
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
        assertNotNull(string);
       assertEquals("gnirtS", reversedStr);
	}

}
