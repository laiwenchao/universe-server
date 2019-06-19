package com.server.java23.factory.general.impl;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.domain.Apple;
import com.server.java23.factory.general.Creator;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:15
 */
public class AppleFactory implements Creator {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
