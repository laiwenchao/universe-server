package com.server.java23.proxy.staticproxy;


import com.server.java23.proxy.staticproxy.impl.CustomerHouse;
import com.server.java23.proxy.staticproxy.impl.CustomerHouseProxy;

/**
 * @author laiwenchao
 * @Classname App
 * @Description 静态代理模式
 * 缺点：为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
 * @Date 2019-06-27 18:43
 */
public class App {
    public static void main(String[] args) {

        //买房消费者
        BuyHouse buyHouse = new CustomerHouse();
        //买房中介
        BuyHouse customerHouseProxy = new CustomerHouseProxy(buyHouse);
        customerHouseProxy.buyHouse();

    }
}
