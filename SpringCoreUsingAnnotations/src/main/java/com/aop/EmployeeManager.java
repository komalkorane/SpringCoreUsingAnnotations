package com.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

	@Bean
	public Employee getEmployee(int id) {
	Employee e = new Employee("Ram", 10);
	return e;
	}
}
