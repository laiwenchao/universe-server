package com.server.java23.factory.general;

import com.server.java23.factory.Fruit;

/**
 * @Description: 简单工厂抽象类，一个子类对应一个工厂（开闭原则），对简单工厂进行了解耦
 * 缺点：要增加产品类时也要相应地增加工厂类
 *
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午8:14
 */
public interface Creator {
    Fruit factory();
}
