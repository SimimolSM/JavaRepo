package com.ust;

import java.util.Scanner;


public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     
			//to declare the dimension of matrix
		     System.out.println("Enter four strings :");
		     String a= scanner.next();
		     String b=scanner.next();
		     String c= scanner.next();
		     String d=scanner.next();
		     
		     int a1 =a.length();
		     int b1 =b.length();
		     int c1 =c.length();
		     int d1 =d.length();
		     
//		     System.out.println(a1);
//		     System.out.println(b1);
//		     
		     int [][] arr1 = new int[a1][b1] ;
		     int [][] arr2 = new int[a1][b1] ;
		     int [][] arr3 = new int[a1][b1] ;

		     if (a1==c1 && b1==d1) {
		    	//accepting first matrix
			     System.out.println("Enter first matrix :");
			     for (int i = 0; i < a1; i++) {
			    	 for (int j = 0; j < b1; j++) {
			    		 arr1[i][j] = scanner.nextInt();
					}
					
				}
			     
			     //accepting second matrix
			     System.out.println("Enter second matrix :");
			     for (int i = 0; i < a1; i++) {
			    	 for (int j = 0; j < b1; j++) {
			    		 arr2[i][j] = scanner.nextInt();
					}
					
				}
			     
			   //printing first matrix
			     System.out.println("First matrix :");
			     for (int i = 0; i < a1; i++) {
			    	 for (int j = 0; j < b1; j++) {
			    		 System.out.print(arr1[i][j]+" ");		
			    	 }
			    	 System.out.println(" ");	
				}
			     
			     scanner.close();
			   //printing second matrix
			     System.out.println("Second matrix :");
			     for (int i = 0; i < a1; i++) {
			    	 for (int j = 0; j < b1; j++) {
			    		 System.out.print(arr2[i][j]+" ");		
			    	 }
			    	 System.out.println(" ");	
				}
			     
			     System.out.println("Matrix Addition");
			     for (int i = 0; i < a1; i++) {
			    	 for (int j = 0; j < b1; j++) {
			    		 arr3[i][j]=arr1[i][j]+arr2[i][j];
			    		 System.out.print(arr3[i][j]+" ");			
					}
			    	 
			    	 System.out.println(" ");	

				}
			     
			     System.out.println("Reverse of the given strings :");
			     StringBuilder str1 =new StringBuilder(a);
			     StringBuilder str2=new StringBuilder(b);
			     StringBuilder str3 =new StringBuilder(c);
			     StringBuilder str4=new StringBuilder(d);
			     
			     System.out.println(str1.reverse());
			     System.out.println(str2.reverse());
			     System.out.println(str3.reverse());
			     System.out.println(str4.reverse());
			} 
		     else {
					System.out.println("You can't proceed further!!");
				}
		   
		    
		     
	}

}
