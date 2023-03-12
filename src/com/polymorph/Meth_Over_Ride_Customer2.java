package com.polymorph;

public class Meth_Over_Ride_Customer2 extends  Meth_Ovr_Ride_BANK{
	
	
	

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
		
		Meth_Over_Ride_Customer2 customer2 = new Meth_Over_Ride_Customer2();
		customer2.customerName("Draco Malfoy");
		
		customer2.KYC(4321_5678_8765_9877l, "PWD6756", "Malfoy manor ,England", 17);
		
		customer2.bank_balance(98765678876d);
		

	}

}
