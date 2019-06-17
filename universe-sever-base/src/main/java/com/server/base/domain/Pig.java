package com.server.base.domain;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/25 下午6:09
 */
public class Pig implements Cloneable {
    private String name;
    private Integer age;

    private Dog cat;

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

    public Dog getCat() {
        return cat;
    }

    public void setCat(Dog cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pig{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", cat=").append(cat);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
