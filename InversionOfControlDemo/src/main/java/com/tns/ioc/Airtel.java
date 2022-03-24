package com.tns.ioc;

public class Airtel implements Sim{
//	Constructor
	public Airtel() {
		System.out.println("I am Airtel object...");
	}

	public void calling() {
		System.out.println("Calling with Airtel Sim...");
	}

	public void data() {
		System.out.println("Browsing with Airtel Sim...");
	}

}
