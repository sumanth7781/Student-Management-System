package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	public Student()
	{
		
	}
	public Student(int id, String faname, String lname, String email) {
		this.id = id;
		this.Faname = faname;
		this.Lname = lname;
		this.Email = email;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Firstname")
	private String Faname;
	@Column(name="Lastname")
	private String Lname;
	@Column(name="EmailId")
	private String Email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFaname() {
		return Faname;
	}
	public void setFaname(String faname) {
		Faname = faname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
