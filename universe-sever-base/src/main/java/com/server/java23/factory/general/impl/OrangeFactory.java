package com.server.java23.factory.general.impl;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.domain.Orange;
import com.server.java23.factory.general.Creator;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:31
 */
public class OrangeFactory implements Creator {
    @Override
    public Fruit factory() {
        return new Orange();
    }
}
