package com.server.java23.factory.abstraction.domain;

import com.server.java23.factory.abstraction.Fruit;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:52
 */
public class NorthAppleFruit implements Fruit {

    @Override
    public void color() {
        System.out.println("北方苹果是绿色");
    }
}
