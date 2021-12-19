package com.project.sms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stdDeatils")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nameWithInitails;
	private String fullName;
	private String address;
	private String dob;
	private String specialAttention;
	private String grade;
	
	
	
	public Student() {
		super();
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameWithInitails() {
		return nameWithInitails;
	}
	public void setNameWithInitails(String nameWithInitails) {
		this.nameWithInitails = nameWithInitails;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSpecialAttention() {
		return specialAttention;
	}
	public void setSpecialAttention(String specialAttention) {
		this.specialAttention = specialAttention;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nameWithInitails=" + nameWithInitails + ", fullName=" + fullName + ", address="
				+ address + ", dob=" + dob + ", specialAttention=" + specialAttention + ", grade=" + grade + "]";
	}
	
	

}
