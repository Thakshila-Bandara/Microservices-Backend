package com.company.departmentservice.service.impl;

import com.company.departmentservice.model.Department;
import com.company.departmentservice.repository.DepartmentRepository;
import com.company.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeparmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Long save(Department department) {

        return departmentRepository.save(department).getId();
    }

    @Override
    public Department findDepartmentById(Long id) {

        return departmentRepository.findDepartmentById(id);
    }


}
