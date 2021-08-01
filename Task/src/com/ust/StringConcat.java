package com.ust;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter four strings :");
	     
	    
	     for(int i=0;i<=4;i++) {
	    	 for(int j=0;j<=4;j++) {
	    		 String [][] strings= new String[i][j];
	    		 strings[i][j] = scanner.next(); 
	    	 }
	    	
	     }
	     

	}

}
