package com.tec.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tec.Entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>
{


}
