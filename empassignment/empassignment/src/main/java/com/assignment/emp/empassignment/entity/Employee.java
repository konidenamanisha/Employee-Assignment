package com.assignment.emp.empassignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String lastName;
	protected Employee(){}
	
	public Employee(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
