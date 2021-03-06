package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.Date;
@Data
@Accessors( chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private Integer age;
    private Date bir;
}
