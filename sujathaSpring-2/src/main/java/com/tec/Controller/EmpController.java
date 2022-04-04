package com.tec.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.Entity.Employee;
import com.tec.Service.ServiceImpl;
import com.tec.dao.EmpRepository;
@RestController
public class EmpController 
{
	
	@Autowired
	private EmpRepository empRepo;
	@Autowired
	private ServiceImpl serRepo;
	
	@GetMapping("/save")
	public Employee saveEmp(@RequestBody Employee employee) 
	{
		
		return serRepo.saveEmp(employee);
	}
	
	@PostMapping("/create")
	public List<Employee> getAllEmp(@RequestBody Employee employee) {
		
		return serRepo.getAllEmp(employee);
	}
	@PutMapping("/update")
	public Employee Upate(@RequestBody Employee employee) 
	{
		
		return serRepo.saveEmp(employee);
	}
	@DeleteMapping("/delete/{id}")
	
	public String delete(@PathVariable("id") int id)
	{
		serRepo.deletemp(id);
		return "Deleted";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
