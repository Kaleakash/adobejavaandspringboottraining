package com.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bean.Employee;

public interface EmployeeData extends JpaRepository<Employee, Integer>{

	@Override
	@Query("select e from Employee e")
	List<Employee> findAll();
}
