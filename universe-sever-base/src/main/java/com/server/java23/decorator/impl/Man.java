package com.server.java23.decorator.impl;

import com.server.java23.decorator.Person;

/**
 * @author laiwenchao
 * @Classname Man
 * @Description
 * @Date 2019-06-26 21:17
 */
public class Man extends Person {

    @Override
    public void wear() {
        System.out.println("我是个男人，我什么都没穿");
    }
}
