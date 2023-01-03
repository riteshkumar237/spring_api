package com.spring.api;

import com.spring.api.model.Employee;
import com.spring.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("Rakesh");
		employee.setLastName("Kumar");
		employee.setEmail("rakesh@email.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Rajesh");
		employee1.setLastName("Kumar");
		employee1.setEmail("rajesh@email.com");
		employeeRepository.save(employee1);

	}
}
