package com.polymorph;

public class Meth_Ovr_Ride_BANK {

	public void customerName(String name) {
		System.out.println("Customer Name  = " + name);

	}

	public void KYC(long Id_number, String pan_number, String address, int age) {

		System.out.println("Id_number =" + Id_number + " " + "pan_number =" + pan_number + " " + "Address ="
				+ address + "  " + " Age =" + age);

	}

	public void bank_balance(double balance) {
		System.out.println("bank_bakance =" + balance);
	}
	public static void main(String[] args) {
		Meth_Ovr_Ride_BANK obj = new Meth_Ovr_Ride_BANK();
		obj.customerName("Musheik");
		
		obj.bank_balance(9876567886l);
		
		obj.KYC(12345678, "poiu2367", "pamban", 24);
	}

}
