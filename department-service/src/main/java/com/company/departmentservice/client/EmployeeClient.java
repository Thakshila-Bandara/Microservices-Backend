package com.company.departmentservice.client;

import com.company.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {


    @GetExchange("/employee/dep-id")
    public List<Employee> findEmployeeByDepartmentId(@RequestParam Long depId);



}
