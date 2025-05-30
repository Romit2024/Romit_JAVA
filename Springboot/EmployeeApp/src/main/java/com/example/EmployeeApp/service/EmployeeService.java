package com.example.EmployeeApp.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmployeeApp.model.Employee;
import com.example.EmployeeApp.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Optional<Employee> getEmployeeById(int id) {
        return repo.findById(id);
    }
}
