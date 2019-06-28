package com.server.java23.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author laiwenchao
 * @Classname App
 * @Description 动态代理，优点是比较灵活
 * @Date 2019-06-27 18:52
 */
public class App {
    public static void main(String[] args) {
        proxyTest();
    }

    /**
     * 如果method.invoke(proxy,...) 会不停地循环调用。因为proxy是代理类的对象，
     * 当该对象方法被调用的时候，会触发InvocationHandler，
     * 而InvocationHandler里面又调用一次proxy里面的对象，所以会不停地循环调用。
     * 并且，proxy对应的方法是没有实现的。所以是会循环的不停报错
     *
     * @Date 2019-06-27 20:44
     **/
    public static void proxyTest() {

        BuyHouse customerBuyHouse = new CustomerHouse();

        BuyHouse buyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class},
                (proxy, method, args) -> {

                    //这一步就执行了被代理对象的原方法
                    Object bh = method.invoke(customerBuyHouse, args);

                    //根据调用不同的方法，执行不同的策略
                    if (method.getName().endsWith("buyHouse")) {
                        System.out.println("买房前我会给你优惠");
                    }
                    if (method.getName().endsWith("loans")) {
                        System.out.println("我会联系银行帮你贷款");
                    }
                    return bh;
                });
        buyHouse.buyHouse();
        buyHouse.loans("小明");
    }

    public static void proxyTest1() {
        BuyHouse buyHouse = new CustomerHouse();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
        proxyBuyHouse.loans("小明");
    }
}
