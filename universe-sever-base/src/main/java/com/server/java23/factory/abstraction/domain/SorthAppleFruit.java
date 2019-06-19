package com.server.java23.factory.abstraction.domain;

import com.server.java23.factory.abstraction.Fruit;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:54
 */
public class SorthAppleFruit implements Fruit {

    @Override
    public void color() {
        System.out.println("南方苹果是红色");
    }
}
