package com.zhaoxfan.domain;

import lombok.Data;

/**
 * @author zhaoxfan
 * @create 2022-01-06 9:30
 */

//lombok，一个Java类库，提供了一组注解，简化POJO实体类的开发
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
