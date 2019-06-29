package com.server.java23.decorator;

public abstract class Clothing extends Person {

    protected Person person;

    public Clothing(Person person) {
        this.person = person;
    }

    public void wear() {
        System.out.println("没有衣服");
    }
}
