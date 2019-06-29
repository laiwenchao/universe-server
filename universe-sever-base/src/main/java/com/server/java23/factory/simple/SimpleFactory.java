package com.server.java23.factory.simple;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.domain.Apple;
import com.server.java23.factory.domain.Orange;

/**
 * @Description: 简单工厂模式也叫做 静态工厂方法模式
 * @Author: laiwenchao02
 * @Date: 2019/6/17 下午9:42
 */
public class SimpleFactory {

    public static Fruit factory(String fruitSwitch) {
        switch (fruitSwitch) {
            case "苹果":
                return new Apple();
            case "橘子":
                return new Orange();
        }
        return null;
    }

}
