package com.company.departmentservice.controller;

import com.company.departmentservice.model.Department;
import com.company.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Long save(@RequestBody Department department){

        return departmentService.save(department);
    }

    @GetMapping
    public Department findDepartmentById(@RequestParam Long id){

        return departmentService.findDepartmentById(id);
    }
}
