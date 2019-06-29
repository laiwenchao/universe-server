package com.server.java23.factory.general;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.general.impl.AppleFactory;
import com.server.java23.factory.general.impl.OrangeFactory;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:32
 */
public class App {
    public static void main(String[] args) {
        Creator appleFactory = new AppleFactory();
        Fruit apple = appleFactory.factory();
        apple.plant();
        apple.grow();

        Creator orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.factory();
        orange.plant();
        orange.grow();
    }
}
