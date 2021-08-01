package test;

import static org.junit.Assert.assertEquals;

public class Palindrome {
//	public static StringBuilder reverse(StringBuilder string) {
//		StringBuilder sb=new StringBuilder(string);
//		
//		return sb.reverse();
//	}
	public static String palindrome(String string) {
		String reversedStr = "";    
	    
	    //Iterate through the string from last and add each character to variable reversedStr    
	    for(int i = string.length()-1; i >= 0; i--){    
	        reversedStr = reversedStr + string.charAt(i);    
	    } 
	    return reversedStr;
	
	}
	
}
