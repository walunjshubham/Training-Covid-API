package com.training.amdocs.entity;



import org.springframework.stereotype.Component;

@Component
public class CovidCenters{
	private String name;
	private String address;
	private int pinCode;
	public CovidCenters() {

	}

	public CovidCenters(String name,String address,int pinCode) {
		this.name=name;
		this.address=address;
		this.pinCode=pinCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



}
