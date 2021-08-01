package com.ust;

import java.util.Scanner;

public class ModeOfTransport {
	String modeOfTravel;
	String destination;
	int passengers;
	int modeOption;
	float cost;
	float totalCost;
	
	Scanner sc= new Scanner(System.in);

	//to get the destination
	public void getDestination() {
		System.out.println("\nSelect the destination :"+ "\n1.Mumbai"+ "\n2.Banglore"+ "\n3.Chennai");
		int ch1=sc.nextInt();
		
		if(ch1==1) {
			destination="Mumbai";
		}
		else if (ch1==2) {
			destination="Bangalore";
		}
		else if (ch1==3) {
			destination="Chennai";
		}
	}

	//to get mode of transport
	public  void getMode() {
		System.out.println("\nPlease select the mode of Transport"
				+ "\n1.Roadways"
				+ "\n2.Railways"
				+ "\n3.Airways");
		modeOption=sc.nextInt();
		if(modeOption==1) {
			modeOfTravel="Roadways";
		}
		else if (modeOption==2) {
			modeOfTravel="Railways";
		}
		else if (modeOption==3) {
			modeOfTravel="Airways";
		}
	}
	
	//to calculate cost
	public void cost() {
		switch (modeOption) {
		
		case 1:
			if ( destination=="Mumbai") {
				cost=1000;
			}
			else if ( destination=="Bangalore") {
				cost=2000;
			}
			else if ( destination=="Chennai") {
				cost=1000;
			}
			break;
		
		case 2:
			if ( destination=="Mumbai") {
				cost=2000;
			}
			else if ( destination=="Bangalore") {
				cost=2500;
			}
			else if ( destination=="Chennai") {
				cost=5000;
			}
			break;

		case 3:
			if ( destination=="Mumbai") {
				cost=1000;
			}
			else if ( destination=="Bangalore") {
				cost=2000;
			}
			else if ( destination=="Chennai") {
				cost=1200;
			}
			break;

		}
	}

	//to get number of passengers
	public void passengers() {
		System.out.println("\nNo of passengers :");
		passengers=sc.nextInt();
	}
	
	//to get total cost
	public void expense() {
		  totalCost = cost*passengers;
		 //System.out.println(totalCost);
	}
	
	//to get details
	public void getDetails() {
		System.out.println("****Bill Generated****"+"\nDestination : "+destination+""
				+ "\nMode of Transport : "+modeOfTravel+""
				+ "\nNo of Passengers : "+passengers+""
						+ "\nTotal Expense : "+totalCost);
	}


}
