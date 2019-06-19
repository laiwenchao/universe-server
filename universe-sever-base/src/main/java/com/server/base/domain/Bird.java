package com.server.base.domain;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/4/28 下午2:26
 */
public class Bird implements Comparable<Bird> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Bird o) {
        int comp = o.age - this.age;
        return comp;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bird{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
