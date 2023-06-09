package com.microservicio.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.departmentservice.entity.Department;

//Heredamos de la clase Departamento, y de tipo (Integer) porque la cariable id es un numero entero
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
}
