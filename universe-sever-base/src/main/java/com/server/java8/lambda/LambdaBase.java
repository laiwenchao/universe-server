package com.server.java8.lambda;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.server.java8.domain.Car;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/20 下午6:05
 */
public class LambdaBase {
    static String str = "ttt";

    public static void main(String[] args) {
        //test();
        method();
    }

    public static void test() {
        List<String> list = Lists.newArrayList("a", "b", "c");
        list.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                System.out.println(s.toUpperCase() + str);
                str = "aa";
                return s.toUpperCase();
            }
        });
    }

    public static void method() {
        Car cc = new Car();

        Car car = Car.create(Car::new);//构造函数
        List<Car> cars = Lists.newArrayList(car);

        cars.forEach(Car::repair);//无参非静态cars.forEach(car1 -> {car1.repair();});
        cars.forEach(Car::collide);//静态cars.forEach(car1 -> {Car.collide(car1);});
        cars.forEach(cc::follow);//非静态
        cars.forEach(car1 -> {
            car1.follow(car1);
        });

        System.out.println(cc == car);

    }
}
