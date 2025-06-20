package com.codeD.springJDBC.FirstApp;

public class StudentDAO {
	private int student_roll;
	private String student_name;
	private String student_address;
	
	public  StudentDAO() {
		
	}
	
	

	public int getStudent_roll() {
		return student_roll;
	}
	public void setStudent_roll(int student_roll) {
		this.student_roll = student_roll;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	
	@Override
	public String toString() {
		return "StudentDAO [student_roll=" + student_roll + ", student_name=" + student_name + ", student_address="
				+ student_address + "]";
	}
	
	
	
}
