package com.server.java8.domain;

import java.util.function.Supplier;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/20 下午6:20
 */
public class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another);
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
