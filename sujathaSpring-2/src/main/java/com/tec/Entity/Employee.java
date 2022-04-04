package com.tec.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee 
{
	
	private int EmpId;
	private String Name;
	private int Department;
	public Employee(int empId, String name, int department) {
		super();
		EmpId = empId;
		Name = name;
		Department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Department=" + Department + "]";
	}
	
	
	
}
