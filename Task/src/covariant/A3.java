package covariant;

public class A3 extends A2{
	   @Override  
	    A1 foo()  
	    {  
	        return this;  
	    }  
	      
	    @Override  
	    void print()  
	    {  
	        System.out.println("Inside the class A3");  
	    }  

}
