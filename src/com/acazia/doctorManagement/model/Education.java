package com.acazia.doctorManagement.model;

public class Education {
	private int id;
	private String education;
	public Education(int id, String education) {
		super();
		this.id = id;
		this.education = education;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
}
