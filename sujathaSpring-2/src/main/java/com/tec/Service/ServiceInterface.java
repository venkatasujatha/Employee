package com.tec.Service;

import org.springframework.web.bind.annotation.PathVariable;

import com.tec.Entity.Employee;

import antlr.collections.List;

public interface ServiceInterface 
{
	public  Employee saveEmp(Employee employee);
	public java.util.List<Employee> getAllEmp(Employee employee);
	public Employee Upate(int id,Employee employee);
	public Employee deletemp(@PathVariable("id") int id);
}
