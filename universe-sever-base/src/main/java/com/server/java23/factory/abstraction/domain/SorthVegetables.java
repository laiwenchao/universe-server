package com.server.java23.factory.abstraction.domain;

import com.server.java23.factory.abstraction.Vegetables;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午10:03
 */
public class SorthVegetables implements Vegetables {
    @Override
    public void taste() {
        System.out.println("很甜");
    }
}
