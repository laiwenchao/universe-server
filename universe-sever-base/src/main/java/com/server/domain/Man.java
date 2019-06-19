package com.server.domain;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/2/23 下午5:56
 */

public class Man extends Persion implements Comparable<Man> {
    public Man(String name, Integer age) {
        super(name, age);
    }

    @Override
    public int compareTo(Man man) {
        return man.getAge() - super.getAge();
    }
}
