package com.exampe.webfluxelastic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "employee")
public class Employee {

    @Id
    private String id;
    @Field(type = FieldType.Object)
    private Organization organization;
    @Field(type = FieldType.Object)
    private Department department;
    private String name;
    private int age;
    private String position;

}
