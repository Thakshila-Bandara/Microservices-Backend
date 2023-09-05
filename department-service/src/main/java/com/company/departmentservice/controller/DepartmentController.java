package com.company.departmentservice.controller;

import com.company.departmentservice.model.Department;
import com.company.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

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
    public ResponseEntity findDepartmentById(@RequestParam Long id){

        if (departmentService.findDepartmentById(id) == null){

            return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);
        }else{

            return new ResponseEntity<Department>(departmentService.findDepartmentById(id), HttpStatus.OK);
        }

    }
}
