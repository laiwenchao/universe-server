package com.server.java23.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author laiwenchao
 * @Classname DynamicProxyHandler
 * @Description
 * @Date 2019-06-27 20:09
 */
public class DynamicProxyHandler implements InvocationHandler {

    //需要被代理的对象
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preBuyHouse();
        Object obj = method.invoke(object, args);
        postBuyHouse();
        return obj;
    }

    private void preBuyHouse() {
        System.out.println("买房前我带你熟悉周围环境");
    }

    private void postBuyHouse() {
        System.out.println("买房后我帮你装修房子");
    }
}
