package com.server.java23.template.impl;

import com.server.java23.template.CookingTemplate;

/**
 * @author laiwenchao
 * @Classname EggsWithTomatoCooking
 * @Description 番茄炒鸡蛋
 * @Date 2019-06-29 16:05
 */
public class EggsWithTomatoCooking extends CookingTemplate {
    @Override
    public void preCooking() {
        System.out.println("切好番茄，打好鸡蛋");
    }

    @Override
    public void cooking() {
        System.out.println("炒番茄和鸡蛋");
    }

    @Override
    public void afterCooking() {
        System.out.println("盛一碗番茄炒鸡蛋到盘子里");
    }
}
