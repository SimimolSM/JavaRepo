package com.ust;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n*****Welcome to TRIVIAN Travel Agency*****");
		
		ModeOfTransport md = new ModeOfTransport();
		PassengerDetails pd =new PassengerDetails();
		
		md.getDestination();
		md.getMode();
		md.passengers();
		pd.getPassenger();
		md.cost();
		pd.getpgrDetails();
		md.expense();
		md.getDetails();
		

	}

}
