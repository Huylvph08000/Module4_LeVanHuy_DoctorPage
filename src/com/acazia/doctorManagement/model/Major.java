package com.acazia.doctorManagement.model;

public class Major {
	protected int id;
	protected String major;
	public Major(int id, String major) {
		super();
		this.id = id++;
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
