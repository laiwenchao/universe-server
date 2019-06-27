package com.server.java23.proxy.dynamicproxy;

import com.server.java23.proxy.dynamicproxy.BuyHouse;

/**
 * @author laiwenchao
 * @Classname CustomerHouse
 * @Description 真实对象
 * @Date 2019-06-27 18:39
 */
public class CustomerHouse implements BuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("我是一个要买房子的消费者");
    }

    @Override
    public void loans(String name) {
        System.out.println(name + "我要贷款");
    }
}
