package com.company.employeeservice.repository;

import com.company.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    public Employee findEmployeeById(Long id);
    public List<Employee> findEmployeeByDepartmentId(Long depId);
}
