package com.tec.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity
@Table(name="student")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Name;
	private int rollNo;
	
	
	public Student(int id, String name, int rollNo) {
		super();
		this.id = id;
		Name = name;
		this.rollNo = rollNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public String setName(String name) {
		return Name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", Name=" + Name + ", rollNo=" + rollNo + "]";
	}
	
	
}
