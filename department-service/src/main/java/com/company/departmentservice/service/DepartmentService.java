package com.company.departmentservice.service;

import com.company.departmentservice.model.Department;

public interface DepartmentService {
    Long save(Department department);

    Department findDepartmentById(Long id);
}
