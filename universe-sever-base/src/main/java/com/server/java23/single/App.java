package com.server.java23.single;

import java.util.concurrent.ExecutorService;

/**
 * @author laiwenchao
 * @Classname App
 * @Description
 * @Date 2019-08-24 21:21
 */
public class App {
    public static void main(String[] args) {
        SingleTest1 singleTest1 = SingleTest1.getInstatnce();
        SingleTest1 singleTest2 = SingleTest1.getInstatnce();
        System.out.println(singleTest1 == singleTest2);

        SingleTest2 singleTest21 = SingleTest2.getInstance();
        SingleTest2 singleTest22 = SingleTest2.getInstance();
        System.out.println(singleTest21 == singleTest22);

        ExecutorService singleTest31 = SingleTest3.INSTANCE.getInstance();
        ExecutorService singleTest32 = SingleTest3.INSTANCE.getInstance();

        System.out.println(singleTest31 == singleTest32);
    }
}
