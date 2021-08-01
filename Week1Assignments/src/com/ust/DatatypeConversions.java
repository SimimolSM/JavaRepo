package com.ust;

import java.util.Arrays;

public class DatatypeConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// character to string
		char char1 = 'S';
        String str = Character.toString(char1);
        System.out.println("Character '"+char1+" to string is: " + str);
        
        //string to character array
        String string = "Java is simple";
        char [] char2 = string.toCharArray();
        System.out.println("String '"+string+"' to character is :"+Arrays.toString(char2));
        
        // character to int
        int value = char1;
        System.out.println("Char '"+char1+"' to int is : "+value);
        
        //int to char 
        int b=65;  
        char c=(char)b;  
        System.out.println("Int '"+b+"' to char :"+c); 
        
        //long to int
        long l=500;  
        int i=(int)l;  
        System.out.println("long '"+l+"' to int "+i);  
        

        
        //int to long
        int i3 = 97;
        long l2 = i3;
        System.out.println("Int '"+i3+"' to long is "+l2);
        
        //boolean to string
        boolean b1= true;
        System.out.println("boolean '"+b1+"' to String is '"+Boolean.toString(b1)+"'"); 
      
        //string to boolean
        String string2 ="";
        System.out.println("String '"+string2+"' to boolean is "+Boolean.valueOf(string2));
        
        //string to int   
        String string3="200";  
        int i4 =Integer.parseInt(string3);
        System.out.println("String '"+string3+"' to int : "+i4);
        
        //int to string
        System.out.println("Int '"+i3+"' to String :"+Integer.toString(i3));
        
        //int to double
        double d1= i3;
        System.out.println("int '"+i3+"' to double :"+d1);
        
        //double to int
        double d2=10.5;  
        int i5=(int)d2;  
        System.out.println("double '"+d2+"' to int :"+i5);  
        
        //double to string
        System.out.println("double '"+d2+"' to string : "+Double.toString(d2));
        
        //string to double
        String string4="19.97";  
        double d3=Double.parseDouble(string4);  
        System.out.println("String '"+string4+"' to double : "+d3);  
 
       /* ---------------------------------------------------------------*/
        
/*--------------------primitive type to object-----------------*/
        
        int var1 = 5;
        double var2 = 5.65;
        boolean var3 = true;

        //converts into wrapper objects
        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);

        // checks if obj are objects of
        // corresponding wrapper class
        if(obj1 instanceof Integer) {
          System.out.println("An object of Integer is created.");
        }

        if(obj2 instanceof Double) {
          System.out.println("An object of Double is created.");
        }

        if(obj3 instanceof Boolean) {
          System.out.println("An object of Boolean is created");
        }

        
/*---------------------------object to primitive type---------------*/
        
     // creates objects of wrapper class
        Integer obj4 = Integer.valueOf(23);
        Double obj5 = Double.valueOf(5.55);
        Boolean obj6 = Boolean.valueOf(true);

        // converts into primitive types
        int var4 = obj4.intValue();
        double var5 = obj5.doubleValue();
        boolean var6 = obj6.booleanValue();

        // print the primitive values
        System.out.println("The value of int variable: " + var4);
        System.out.println("The value of double variable: " + var5);
        System.out.println("The value of boolean variable: " + var6);

        
        
        

        
	} 

}
