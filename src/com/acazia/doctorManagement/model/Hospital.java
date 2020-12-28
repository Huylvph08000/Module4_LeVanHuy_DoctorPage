package com.acazia.doctorManagement.model;

public class Hospital {
	protected int id;
	protected String hospital;
	public Hospital(int id, String hospital) {
		super();
		this.id = id++;
		this.hospital = hospital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
}
