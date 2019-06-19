package com.server.java23.factory.simple;

import com.server.java23.factory.Fruit;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:11
 */
public class App {
    public static void main(String[] args) {
        Fruit fruit = SimpleFactory.factory("苹果");
        fruit.plant();
        fruit.grow();
    }
}
