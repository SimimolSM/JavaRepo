package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result1 = JUnitCore.runClasses(StringReverse.class);					
		for (Failure failure : result1.getFailures()) {							
			System.out.println(failure.toString());					
		}		
		System.out.println("Result of StringReverse Class=="+result1.wasSuccessful());		

	}

}
