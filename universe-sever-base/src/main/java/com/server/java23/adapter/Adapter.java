package com.server.java23.adapter;

/**
 * 适配器角色
 */
public class Adapter implements Target {

    //如果是继承Adaptee类则是基于类的适配器，现在这样写法是基于对象的适配器
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void originMethod() {
        adaptee.originMethod();
    }

    @Override
    public void targetMethod() {
        System.out.println("适配器类有了新的方法");
    }
}
