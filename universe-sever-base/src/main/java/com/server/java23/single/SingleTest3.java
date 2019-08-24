package com.server.java23.single;

import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author laiwenchao
 * @Classname SingleTest3
 * @Description 利用枚举的构造方法只会初始化异常的特性，可以抵御反射攻击
 * @Date 2019-08-24 21:26
 */
public enum SingleTest3 {

    INSTANCE;

    private final ExecutorService executorService;

    public ExecutorService getInstance() {
        return executorService;
    }

    private SingleTest3() {
        executorService = Executors.newCachedThreadPool();
        System.out.println("枚举构造方法只调用一次");
    }

    public static void main(String[] args) throws Exception {
        ExecutorService s1 = SingleTest3.INSTANCE.getInstance();
        ExecutorService s2 = SingleTest3.INSTANCE.getInstance();
        System.out.println(s1 == s2);
        Constructor<SingleTest3> constructor = SingleTest3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTest3 single = constructor.newInstance();
        ExecutorService e1 = single.executorService;
        System.out.println(s1 == e1);
        System.out.println(s2 == e1);

    }


}
