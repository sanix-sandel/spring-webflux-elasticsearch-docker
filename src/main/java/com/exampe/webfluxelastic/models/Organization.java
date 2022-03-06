package com.exampe.webfluxelastic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Document(indexName = "organization")
public class Organization {

    private Long id;
    private String name;
    private String address;
}
