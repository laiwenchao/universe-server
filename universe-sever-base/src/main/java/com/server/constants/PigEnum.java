package com.server.constants;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/25 下午6:46
 */
public enum  PigEnum {
    PEI_QI("佩奇",12),BA_JIE("八戒",323);

    private String name;
    private Integer age;

    PigEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}
