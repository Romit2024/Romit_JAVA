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
        repo.save(new Employee(10104, "Shreyas", "Junior Engineer", "shreyas@tcs.com", 85093, 12400.00));
        repo.save(new Employee(10105, "Rahul", "Tester", "rahul@tcs.com", 34567, 21000.00
        repo.save(new Employee(10106, "Hardik", "Business Analyst", "hardik@tcs.com", 98788, 12500.00
        repo.save(new Employee(10107, "Axar", "Junior Engineer", "axar@tcs.com", 90963, 18970.00
        repo.save(new Employee(10108, "Kuldeep", "Junior Designer", "kuldeep@tcs.com", 89633, 10000.00
        repo.save(new Employee(10109, "Bumrah", "Admin", "bumrah@tcs.com", 97763, 111120.00
        repo.save(new Employee(10010, "Siraj", "Technical Analyst", "siraj@tcs.com", 90763, 19000.00
       }
}

