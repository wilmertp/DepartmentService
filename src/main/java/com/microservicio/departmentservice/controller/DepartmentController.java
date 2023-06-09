package com.microservicio.departmentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.microservicio.departmentservice.entity.Department;
import com.microservicio.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	private final DepartmentService departmentService;
		
		public DepartmentController(DepartmentService departmentService) {
			this.departmentService = departmentService;
		}
	
		@PostMapping
		public Department createDepartment(@RequestBody Department department) {
			return departmentService.createDepartment(department);
		}
		
		@GetMapping("/{id}")
		public Department getDepartmentById(@PathVariable Integer id) {
			return departmentService.getDepartmentById(id);
		}
		
		@GetMapping
		public List<Department> findAll(){
			return departmentService.findAll();
		}
		
}