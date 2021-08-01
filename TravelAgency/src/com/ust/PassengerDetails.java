package com.ust;

import java.util.Scanner;

public class PassengerDetails {
	String name;
	String gender;
	int age;
	String phnumber;
	String location;

	Scanner sc= new Scanner(System.in);
	
	public void  getPassenger() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter Name :");
		name=sc.nextLine();
		System.out.println("Enter Gender :");
		gender=sc.next();
		System.out.println("Enter Age :");
		age=sc.nextInt();
		System.out.println("Enter Contact Number :");
		phnumber=sc.next();
		System.out.println("Enter Location :");
		location=sc.next();


	} 

	//get passenger details
	public void getpgrDetails() {
		System.out.println("\n*****Your Ticket Successfully  Booked!!!*****"
				+ "\nName : "+name+""
				+ "\nGender : "+gender+""
				+ "\nAge : "+age+""
				+ "\nContact number : "+phnumber+""
				+ "\nLocation : "+location+"\n");
	}

}
