package com.example.EmployeeApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.EmployeeApp.model.Employee;
import com.example.EmployeeApp.repository.EmployeeRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repo;

    public DataLoader(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        repo.save(new Employee(10101, "Rohit", "Senior Developer", "rohit@tcs.com", 98745, 20000.00));
        repo.save(new Employee(10102, "Subhman", "Designer", "subhman@tcs.com", 9874, 10000.00));
        repo.save(new Employee(10103, "Virat", "Team Lead", "virat@tcs.com", 98743, 200000.00));
    }
}

