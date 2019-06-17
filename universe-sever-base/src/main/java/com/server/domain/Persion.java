package com.server.domain;



/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/2/23 下午4:03
 */

public class Persion {
    private String name;
    private Integer age;

    public Persion() {

    }

    public Persion(String name, Integer age) {
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persion{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
