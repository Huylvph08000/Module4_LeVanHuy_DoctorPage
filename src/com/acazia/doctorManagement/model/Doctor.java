package com.acazia.doctorManagement.model;


public class Doctor {
	protected int doctor_id;
	protected String doctor_name;
	protected String sex;
	protected String nationality;
	protected String adress;
	protected String phonenumber;
	protected String work;
	protected String major_name;
	protected String title;
	protected String hospital_name;

	
	public Doctor() {
	}


	public Doctor(int doctor_id, String doctor_name, String sex, String nationality, String adress, String phonenumber,
			String work, String major_name, String title, String hospital_name) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.sex = sex;
		this.nationality = nationality;
		this.adress = adress;
		this.phonenumber = phonenumber;
		this.work = work;
		this.major_name = major_name;
		this.title = title;
		this.hospital_name = hospital_name;
	}


	public Doctor(String doctor_name, String sex, String nationality, String adress, String phonenumber, String work,
			String major_name, String title, String hospital_name) {
		super();
		this.doctor_name = doctor_name;
		this.sex = sex;
		this.nationality = nationality;
		this.adress = adress;
		this.phonenumber = phonenumber;
		this.work = work;
		this.major_name = major_name;
		this.title = title;
		this.hospital_name = hospital_name;
	}


	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}


	public String getDoctor_name() {
		return doctor_name;
	}


	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getMajor_name() {
		return major_name;
	}


	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getHospital_name() {
		return hospital_name;
	}


	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	
	
}