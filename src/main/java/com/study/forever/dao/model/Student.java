package com.study.forever.dao.model;

import lombok.Data;

/**
 * 学生
 */
@Data
public class Student {
    private Integer studentId;
    private String name;
    private Integer age;
    private String grade;

}
