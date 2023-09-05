package com.company.employeeservice.controller;

import com.company.employeeservice.model.Employee;
import com.company.employeeservice.repository.EmployeeRepository;
import com.company.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public void save(@RequestBody Employee employee){

        employeeService.save(employee);
    }
}
