package com.server.java23.factory.abstraction;

import com.server.java23.factory.abstraction.domain.Fruit;
import com.server.java23.factory.abstraction.domain.Vegetables;

/**
 * @Description: 抽象工厂，创建水果和蔬菜
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
