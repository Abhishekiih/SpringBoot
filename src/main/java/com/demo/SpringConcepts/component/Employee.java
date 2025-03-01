package com.demo.SpringConcepts.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name = "Mark Taylor";

    @Autowired  // Injecting Department Bean
    private Department department;

    public String getEmployeeDetails() {
        return "Employee: " + name + ", Department: " + department.getDeptName();
    }
}
