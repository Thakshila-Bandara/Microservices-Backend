package com.company.employeeservice.repository;

import com.company.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {


}
