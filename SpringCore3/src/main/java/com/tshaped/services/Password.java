package com.tshaped.services;

public class Password {
	
	String algo;
	
	public Password(String algo) {
		System.out.println("password bean created");
		this.algo = algo;
	}
	
	public String aboutAlgo() {
		return "Algo used is "+algo;
	}
	

}
