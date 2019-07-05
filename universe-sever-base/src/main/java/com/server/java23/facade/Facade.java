package com.server.java23.facade;

/**
 * @author laiwenchao
 * @Classname Facade
 * @Description
 * @Date 2019-07-05 18:35
 */
public class Facade {
    private static Camera camera;
    private static Sensor sensor;
    private static Light light;

    static {
        camera = new Camera();
        sensor = new Sensor();
        light = new Light();
    }

    public void active(){
        light.turnOn();//开灯
        camera.turnOn();//开摄像机
        sensor.active();
        sensor.trigger();
        sensor.unActive();
        camera.turnOff();//关摄像机
        light.turnOff();
    }
}
