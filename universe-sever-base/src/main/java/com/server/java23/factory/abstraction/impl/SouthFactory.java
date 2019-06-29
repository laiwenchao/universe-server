package com.server.java23.factory.abstraction.impl;

import com.server.java23.factory.abstraction.AbstractFactory;
import com.server.java23.factory.abstraction.domain.*;

/**
 * @Description: 南方工厂，创建南方的水果和蔬菜
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:57
 */
public class SouthFactory implements AbstractFactory {
    @Override
    public Fruit createFruit(String name) {
        switch (name) {
            case "苹果":
                return new NorthApple();
            case "橘子":
                return new NorthOrange();
        }
        return null;
    }

    @Override
    public Vegetables createVegetable() {
        return new SouthCabbage();
    }
}
