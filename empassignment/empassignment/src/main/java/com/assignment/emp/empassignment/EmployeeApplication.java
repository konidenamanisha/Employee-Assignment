package com.assignment.emp.empassignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.emp.empassignment.entity.Employee;
import com.assignment.emp.empassignment.repository.EmployeeRepository;


@SpringBootApplication
public class EmployeeApplication   implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository  repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Employee employee = repository.findById(110L);
		logger.info("employee 110 = {}",employee);
	repository.deleteById(110L);
		repository.save(new Employee("mani","sha"));
	}

}
