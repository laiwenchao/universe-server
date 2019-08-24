package com.server.java23.decorator;

/**
 * @Author laiwenchao
 * @Description 衣服抽象
 * @Date 2019-08-17 15:38
 * @Param
 * @return
 **/
public abstract class Clothing extends Person {

    protected Person person;

    public Clothing(Person person) {
        this.person = person;
    }

    public void wear() {
        System.out.println("没有衣服");
    }
}
