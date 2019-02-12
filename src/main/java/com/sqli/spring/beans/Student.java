package com.sqli.spring.beans;

public class Student {

	private String cne;
	private String studentFullName;
	private String studentEmail;
	private String StudentPhone;

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String cne, String studentFullName, String studentEmail, String studentPhone) {
		super();
		this.cne = cne;
		this.studentFullName = studentFullName;
		this.studentEmail = studentEmail;
		StudentPhone = studentPhone;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}

}
