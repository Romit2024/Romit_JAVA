package com.example.EmployeeApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String designation;
    private String email;
    private long phonenumber;
    private double salary;
}
