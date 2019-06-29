package com.server.java23.factory.abstraction.domain;

/**
 * @Description: 北方包菜
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午10:03
 */
public class NorthCabbage implements Vegetables {

    @Override
    public void taste() {
        System.out.println("北方的包菜不甜");
    }
}
