package com.way2next.madhan.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class College {
    @Id
    private Integer id;
    private String collegeName;
    private String location;
    private String imgUrl;
}
