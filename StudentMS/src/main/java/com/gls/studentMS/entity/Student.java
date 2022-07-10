package com.gls.studentMS.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
public class Student {
	@Id
	@Column(name = "studentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "course")
	private String course;
	@Column(name = "country")
	private String country;
	
	public Student(String firstname,String lastName, String course, String country) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}
	
	public Student() {
		
	}
	
	

}
