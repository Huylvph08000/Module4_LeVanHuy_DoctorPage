package com.acazia.doctorManagement.model;

public class Nationality {
	protected int id;
	protected String country;
	public Nationality() {
		super();
	}
	public Nationality(int id, String country) {
		super();
		this.id = id++;
		this.country = country;
	}
	public Nationality(String country) {
		super();
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
