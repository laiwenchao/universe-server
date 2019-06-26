package com.server.java23.factory.abstraction;

import com.server.java23.factory.abstraction.domain.Fruit;
import com.server.java23.factory.abstraction.domain.Vegetables;

/**
 * @Description: 抽象工厂，可以生产多个产品；例如：创建水果和蔬菜；但是每个产品都是一系列的，比如都是北方的；
 *               工厂方法只能生产一个产品例如都是水果；
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:06
 */
public interface AbstractFactory {

    /**
     * 创建水果
     *
     * @return
     */
    Fruit createFruit(String name);

    /**
     * 创建蔬菜
     *
     * @return
     */
    Vegetables createVegetable();
}
