package com.company.departmentservice.repository;

import com.company.departmentservice.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository     //used to indicate that the class provides the mechanism for storage,
                    // retrieval, search, update and delete operation on objects.

public interface DepartmentRepository extends MongoRepository<Department, Long> {



}
