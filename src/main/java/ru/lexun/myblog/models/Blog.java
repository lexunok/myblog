package ru.lexun.myblog.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Blog {

    @Id
    private Long id;
    private String text;
}
