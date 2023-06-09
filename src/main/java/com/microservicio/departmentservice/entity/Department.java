package com.microservicio.departmentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data					//define los getter y setter de los atributos
@AllArgsConstructor		//Define un constructor con todos los parametros 
@NoArgsConstructor		//Define un constructor vacio
public class Department {
	
	@Id														//Define como clave primaria a la variable id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//Generacion de clave automatico e incremental
	private Integer id;
	private String name;
	private String code;
}
