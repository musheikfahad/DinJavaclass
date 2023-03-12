package com.abstraction;

// child 
//multiple inheritance

public class Interface_Phone implements Interface_samsung, Interface_Apple, Interface_realme {

	@Override
	public void realme_store() {
		
		String realmestore = "in real me store";

		System.out.println(realmestore + " => we can order real products ");

	}

	@Override
	public void realme_share() {
		
		String RealmeShare = "realme share";
		System.out.println(RealmeShare +" => Is the fastest way to share a data");

	}

	@Override
	public void facetime() {
		String facetimer ="facetime =>";
		System.out.println(facetimer +"   Is a special features availabe on Iphone like google meet");

	}

	@Override
	public void safari_Browser() {
		String safari = " safari =>";
		System.out.println(safari+"    safari is the safest browser");

	}

	@Override
	public void itunes() {
	String 	itune = "Itunes =>";
		System.out.println( itune +"   best for listening and downloading music");

	}

	@Override
	public void samsungLauncher() {
		String Samsunglauncher = "Android/Iphone launcher =>";
		
		System.out.println(Samsunglauncher+"  every phone has launcher, it helps to interact with apps in our phones");

	}

	@Override
	public void samsunggallery() {
		
		String gallery = "keeps pics";
		
		System.out.println("gallery =>" + gallery);

	}

	@Override
	public void samsungcalllog() {
		
		String Samsunglogs = "Call logs =>";
		System.out.println( Samsunglogs+"  keeps history of every number we dialed ");

	}

	public static void main(String[] args) {

		Interface_Phone object = new Interface_Phone();
		object.samsungcalllog();
		object.samsungLauncher();
		object.samsunggallery();
		object.facetime();
		object.safari_Browser();
		object.itunes();
		object.realme_share();
		object.realme_store();

	}

}
