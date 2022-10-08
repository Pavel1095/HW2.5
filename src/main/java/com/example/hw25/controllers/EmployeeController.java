package com.example.hw25.controllers;

import com.example.hw25.employee.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName){
        return new Employee(firstName, lastName);
    }
}
