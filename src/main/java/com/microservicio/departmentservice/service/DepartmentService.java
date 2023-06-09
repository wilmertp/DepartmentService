package com.microservicio.departmentservice.service;

import org.springframework.stereotype.Service;

import com.microservicio.departmentservice.entity.Department;
import com.microservicio.departmentservice.repository.DepartmentRepository;

import java.util.List;


@Service
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		
		this.departmentRepository = departmentRepository;
	}
	
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department getDepartmentById(Integer id) {
		return departmentRepository.findById(id).get();
	}

	public List<Department> findAll(){
		return departmentRepository.findAll();
	}
}
