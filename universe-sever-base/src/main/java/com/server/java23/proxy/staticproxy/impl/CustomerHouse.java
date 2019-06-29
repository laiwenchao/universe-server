package com.server.java23.proxy.staticproxy.impl;

import com.server.java23.proxy.staticproxy.BuyHouse;

/**
 * @author laiwenchao
 * @Classname CustomerHouse
 * @Description 真实对象
 * @Date 2019-06-27 18:39
 */
public class CustomerHouse implements BuyHouse {

    public CustomerHouse() {
    }

    @Override
    public void buyHouse() {
        System.out.println("我是一个要买房子的消费者");
    }
}
