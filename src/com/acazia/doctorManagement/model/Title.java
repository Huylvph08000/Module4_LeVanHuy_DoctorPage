package com.acazia.doctorManagement.model;

public class Title {
	protected int id;
	protected String title;
	public Title(int id, String title) {
		super();
		this.id = id++;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
