  package com.polymorph;
// method over loading
public class Customers_methoverloading {

	public void customerDatas(String name, long Bank_balance) {

		System.out.println(name + ", " + Bank_balance);

	}

	public void customerDatas(String name, long Bank_balance, String branch) {

		System.out.println(name + " , " + Bank_balance + " , " + branch);

	}

	public void customerDatas(String name, long Bank_balance, String branch, String address) {

		System.out.println(name + " , " + Bank_balance + " , " + branch + " , " + address);
	}

	public void customerDatas(String name) {

		System.out.println(name);

	}

	public void customerDatas(String name, long Bank_balance, char initial) {

		System.out.println(name + " , " + Bank_balance + " , " + initial);

	}

	public static void main(String[] args) {

		Customers_methoverloading object = new Customers_methoverloading();

		object.customerDatas("Jeff Bezos", 20000000000l);

		object.customerDatas("Elon Musk", 4000908876867l, 'M');

		object.customerDatas("Bruce Wayne AKA Batman", 100099767578888l, "GOTHAM NATIONAL BANK",
				"WAyne Mansion , GOTHAM city, USA");

		object.customerDatas("Musheik Fahath");

	}

}
