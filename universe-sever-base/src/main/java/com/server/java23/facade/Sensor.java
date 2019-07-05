package com.server.java23.facade;

/**
 * @author laiwenchao
 * @Classname Sensor
 * @Description 感应器类
 * @Date 2019-07-05 18:33
 */
public class Sensor {

    public void active() {
        System.out.println("启动感应器");
    }

    public void unActive() {
        System.out.println("关闭感应器");
    }

    public void trigger() {
        System.out.println("触发感应器");
    }
}
