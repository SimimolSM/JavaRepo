package covariant;

public class A2 extends A1{
	 @Override  
	    A1 foo()  
	    {  
	        return this;  
	    }  
	      
	    void print()  
	    {  
	        System.out.println("Inside the class A2");  
	    }  

}
