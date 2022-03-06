package com.exampe.webfluxelastic.dto;

import com.exampe.webfluxelastic.models.Department;
import com.exampe.webfluxelastic.models.Organization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private String id;
    private Organization organization;
    private Department department;
    private String name;
    private int age;
    private String position;
}
