package com.example.EmployeeApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeApp.model.Employee;
import com.example.EmployeeApp.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
}
