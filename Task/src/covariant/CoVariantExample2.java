package covariant;
class A4  
{  
    A4 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A5 extends A4  
{  
    @Override  
    A5 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A6 extends A5  
{  
    @Override  
    A6 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  

public class CoVariantExample2 {

	// main method  
    public static void main(String argvs[])  
    {  
       A4 a4 = new A4();  
         
       a4.foo().print();  
         
       A5 a5 = new A5();  
         
       a5.foo().print();  
         
       A6 a6 = new A6();  
         
       a6.foo().print();  
         
    }  

}
