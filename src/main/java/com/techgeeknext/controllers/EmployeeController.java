package com.techgeeknext.controllers;

import com.techgeeknext.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public Employee getEmployee() {
        return Employee.builder().id(1).name("TechGeekNext").role("Admin").build();
    }
}
