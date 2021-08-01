package factory_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory();  

		System.out.print("Enter the name of plan for which the bill will be generated: ");  
		Scanner scanner = new Scanner(System.in);  

		String planName=scanner.nextLine();
		System.out.print("Enter the number of units for bill will be calculated: ");  
		int units=Integer.parseInt(scanner.nextLine());  

		Plan p = planFactory.getPlan(planName);  
		//call getRate() method and calculateBill()method of DomesticPaln.  

		System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
		p.getRate();  
		p.calculateBill(units);  


	}

}
