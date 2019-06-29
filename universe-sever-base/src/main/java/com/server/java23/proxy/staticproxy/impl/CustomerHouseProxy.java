package com.server.java23.proxy.staticproxy.impl;

import com.server.java23.proxy.staticproxy.BuyHouse;

/**
 * @author laiwenchao
 * @Classname CustomerHouseProxy
 * @Description
 * @Date 2019-06-27 18:41
 */
public class CustomerHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public CustomerHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        preBuyHouse();
        buyHouse.buyHouse();
        postByHouse();
    }

    public void preBuyHouse() {
        System.out.println("买房子前我带你熟悉周围环境");
    }

    public void postByHouse() {
        System.out.println("买房子后我帮你装修房子");
    }
}
