package com.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/15 下午2:49
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private String gender;

    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
