package com.company.employeeservice.service.serviceimpl;

import com.company.employeeservice.model.Employee;
import com.company.employeeservice.repository.EmployeeRepository;
import com.company.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
    private EmployeeRepository employeeRepository;

   @Override
   public void save(Employee employee){

       employeeRepository.save(employee);
   }

    @Override
    public Employee findEmployeeById(Long id) {

       return employeeRepository.findEmployeeById(id);
    }

    @Override
    public List<Employee> findEmployeeByDepartmentId(Long depId) {

       return employeeRepository.findEmployeeByDepartmentId(depId);

    }


}
