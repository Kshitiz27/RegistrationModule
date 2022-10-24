package com.registrationmodule.entity;

public class student {
	
	private int id;
	private String fname;
	private String lname;
	private String mother_name;
	private String father_name;
	private String address;
	private String gender;
	private String state;
	private String city;
	private String dob;
	private String pincode;
	private String course;
	private String email_address;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mother_name=" + mother_name
				+ ", father_name=" + father_name + ", address=" + address + ", gender=" + gender + ", state=" + state
				+ ", city=" + city + ", dob=" + dob + ", pincode=" + pincode + ", course=" + course + ", email_address="
				+ email_address + ", password=" + password + "]";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String fname, String lname, String mother_name, String father_name, String address, String gender,
			String state, String city, String dob, String pincode, String course, String email_address,
			String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mother_name = mother_name;
		this.father_name = father_name;
		this.address = address;
		this.gender = gender;
		this.state = state;
		this.city = city;
		this.dob = dob;
		this.pincode = pincode;
		this.course = course;
		this.email_address = email_address;
		this.password = password;
	}
	
	



	
	


}