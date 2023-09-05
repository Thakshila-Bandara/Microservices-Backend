package com.company.employeeservice.service;

import com.company.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {

    void save (Employee employee);

    Employee findEmployeeById(Long id);

    List<Employee> findEmployeeByDepartmentId(Long depId);
}
