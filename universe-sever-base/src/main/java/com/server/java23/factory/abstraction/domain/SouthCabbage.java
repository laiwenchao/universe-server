package com.server.java23.factory.abstraction.domain;

/**
 * @Description: 南方包菜
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午10:03
 */
public class SouthCabbage implements Vegetables {
    @Override
    public void taste() {
        System.out.println("南方的包菜很甜");
    }
}
