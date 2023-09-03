package com.company.departmentservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Document(collection = "department")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {

    @Id
    private Long id;
    private String name;

    private List<Employee> employees = new ArrayList<>();
}
