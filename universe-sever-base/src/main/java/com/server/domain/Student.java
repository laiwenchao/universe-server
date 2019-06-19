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
}
