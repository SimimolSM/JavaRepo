package com.ust;

public class VirtualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("Call mailCheck using Salary reference --");   
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
//		Employee e1 = new Employee("Simi", "Trivandrum", 5154);
//		e1.mailCheck();

	}

}
