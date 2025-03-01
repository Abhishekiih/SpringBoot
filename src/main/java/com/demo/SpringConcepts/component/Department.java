package com.demo.SpringConcepts.component;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName = "Engineering";

    public String getDeptName() {
        return deptName;
    }
}

