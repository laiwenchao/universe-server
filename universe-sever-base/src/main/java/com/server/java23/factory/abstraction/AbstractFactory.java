package com.server.java23.factory.abstraction;

import com.server.java23.factory.Fruit;
import com.server.java23.factory.abstraction.impl.NorthFactory;
import com.server.java23.factory.abstraction.impl.SorthFactory;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/18 下午9:06
 */
public interface AbstractFactory {

    /**
     * 创建北方水果
     *
     * @return
     */
    NorthFactory northFactory();

    /**
     * 创建南方水果
     *
     * @return
     */
    SorthFactory sorthFactory();
}
