package matrix_program;

import java.util.Scanner;

public class MatrixMuliplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner scanner = new Scanner(System.in);
     
     //to declare the dimension of matrix
     System.out.println("Enter number of rows and columns of first matrix:");
     int a= scanner.nextInt();
     int b=scanner.nextInt();
     int [][] arr1 = new int[a][b] ;
     
  
     System.out.println("Enter number of rows and columns of second matrix : ");
     int x=scanner.nextInt();
     int y=scanner.nextInt();
     int [][] arr2 = new int[x][y] ;
     
    
     if(b!=x) {
    	System.out.println("These 2 matrices cannot be multiplied");
     }
     else {
    	 //accepting first matrix
         System.out.println("Enter first matrix :");
         for (int i = 0; i < a; i++) {
        	 for (int j = 0; j < b; j++) {
        		 arr1[i][j] = scanner.nextInt();
    		}
    		
    	}
    	 //accepting second matrix
         System.out.println("Enter second matrix :");
         for (int i = 0; i < x; i++) {
        	 for (int j = 0; j < y; j++) {
        		 arr2[i][j] = scanner.nextInt();
    		}
    		
         }
         
         scanner.close();
         
       //printing first matrix
         System.out.println("First matrix :");
         for (int i = 0; i < a; i++) {
        	 for (int j = 0; j < b; j++) {
        		 System.out.print(arr1[i][j]+" ");		
        	 }
        	 System.out.println(" ");	
    	}
         
         //printing second matrix
         System.out.println("Second matrix :");
         for (int i = 0; i < x; i++) {
        	 for (int j = 0; j < y; j++) {
        		 System.out.print(arr2[i][j]+" ");		
        	 }
        	 System.out.println(" ");	
    	}
         
    	 //multiplying two matrices and printing
         System.out.println("After Multiplication :");
         int [][] arr3 = new int[a][y];
         for(int i=0;i<a;i++){    
        	 for(int j=0;j<y;j++){       
        		 for(int k=0;k<x;k++)      
        		 {      
        			 arr3[i][j]+=arr1[i][k]*arr2[k][j];      
        		 }  
        		 System.out.print(arr3[i][j]+" ");  //printing matrix element  
        	 } 
        	 System.out.println();   
        } 
	}
    
     
     
     
    
     
	}

}
