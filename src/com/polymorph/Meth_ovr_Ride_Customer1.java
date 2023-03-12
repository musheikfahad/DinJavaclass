package com.polymorph;

public class Meth_ovr_Ride_Customer1 extends  Meth_Ovr_Ride_BANK {

	
	
	
	@Override
	public void customerName(String name) {
		// TODO Auto-generated method stub
		super.customerName(name);
	}

	@Override
	public void KYC(long Id_number, String pan_number, String address, int age) {
		// TODO Auto-generated method stub
		super.KYC(Id_number, pan_number, address, age);
	}

	@Override
	public void bank_balance(double balance) {
		// TODO Auto-generated method stub
		super.bank_balance(balance);
	}

	public static void main(String[] args) {
		
		
		Meth_ovr_Ride_Customer1 customer1 = new Meth_ovr_Ride_Customer1();
		
		customer1.customerName("Harry Potter");
		
		customer1.KYC(1234_4567_9876l, "PQD8767", " No.4 , private drive,Little Whinging , Surrey ,", 17);
		
		customer1.bank_balance(9876545678d);

	}

}
