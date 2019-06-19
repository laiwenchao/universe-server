package com.server.java23.factory.domain;

import com.server.java23.factory.Fruit;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:07
 */
public class Orange implements Fruit {
    @Override
    public void grow() {
        System.out.println("橘子生长");
    }

    @Override
    public void plant() {
        System.out.println("橘子种植");
    }
}
