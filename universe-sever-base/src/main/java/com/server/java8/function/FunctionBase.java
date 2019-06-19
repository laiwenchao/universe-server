package com.server.java8.function;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @Description: java8函数式编程
 * @Author: laiwenchao02
 * @Date: 2019/3/19 下午6:47
 */
public class FunctionBase {
    public static void main(String[] args) {
        //supplier();
    }

    public static void consumer() {
        List<String> list = Lists.newArrayList("a", "b", "c");

        //消费某个对象
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        list.forEach(consumer);
    }

    public static void biconsumer() {
        List<String> list = Lists.newArrayList("a", "b", "c");

        //消费某个对象
        new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + ":" + s2);
            }
        };

    }

    public static void predicate() {
        List<String> list = Lists.newArrayList("a", "b", "c");

        //判断对象是否符合某个条件
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("b");
            }
        });
        System.out.println(list);
    }

    public static void function() {
        List<String> list = Lists.newArrayList("a", "b", "c");

        //实现一个”一元函数“，即传入一个值经过函数的计算返回另一个值。
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        List<String> result = list.stream().map(function).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void supplier() {
        String str = null;

        //创建一个对象（工厂类）
        Supplier supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "没有值";
            }
        };

        String result = Optional.ofNullable(str).orElseGet(supplier);
        System.out.println(result);
    }


}
