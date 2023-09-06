package com.company.departmentservice.service;

import com.company.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {
    Long save(Department department);

    Department findDepartmentById(Long id);

    List<Department> findAll();
}
