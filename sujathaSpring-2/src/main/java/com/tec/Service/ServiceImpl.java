package com.tec.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.Entity.Employee;
import com.tec.dao.EmpRepository;
@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
	EmpRepository empRepo;
	
	@Override
	public Employee saveEmp(Employee employee) 
	{
		
		 return empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmp(Employee employee) {
		
		return empRepo.findAll();
	}

	@Override
	public Employee Upate(int id,Employee employee) 
	{
		
		return empRepo.save(employee);
	}

	
	@Override
	public Employee deletemp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
