package com.ust;

public class PrintingSPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,height = 5;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++) 
	        {
	            if ((i == 0 || i == height / 2
	                || i == height - 1))
	                System.out.printf("*");
	            else if (i < height / 2
	                    && j == 0)
	                System.out.printf("*");
	            else if (i > height / 2
	                    && j == height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	}

}
