package com.demo.SpringConcepts;

import com.demo.SpringConcepts.component.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

		logger.debug("Fetching Employee Bean from ApplicationContext");
		Employee employee = context.getBean(Employee.class);

		logger.info("Employee Details: {}", employee.getEmployeeDetails());
	}
}
