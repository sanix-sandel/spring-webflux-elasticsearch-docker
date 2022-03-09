package com.exampe.webfluxelastic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "posts")
public class Post {

    @Id
    private String id;
    private String title;
    private Date date;
    private String content;
    private Double rating;
    private Integer views;
}
