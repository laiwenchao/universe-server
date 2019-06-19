package com.server.java23.factory.abstraction.impl;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.abstraction.AbstractFactory;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:57
 */
public class NorthFactory implements AbstractFactory {

    @Override
    public NorthFactory northFactory() {
        return null;
    }

    @Override
    public SorthFactory sorthFactory() {
        return null;
    }
}
