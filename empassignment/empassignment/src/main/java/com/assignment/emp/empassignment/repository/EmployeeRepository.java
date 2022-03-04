package com.assignment.emp.empassignment.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.assignment.emp.empassignment.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class EmployeeRepository {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
     @Autowired
	EntityManager em;

	public Employee findById(Long id) {
		return em.find(Employee.class, id);
	}
	
	public void deleteById(Long id) {
		Employee employee = findById(id);
		em.remove(employee);
		
	}
   
	public Employee save(Employee employee) {
		
		if (employee.getId() == null) {
			em.persist(employee);
		} else {
			em.merge(employee);
		}

		return employee;
	}

	}










