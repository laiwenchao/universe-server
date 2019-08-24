package com.server.java23.single;

import java.lang.reflect.Constructor;

/**
 * @author laiwenchao
 * @Classname SingleTest2
 * @Description 该单利不能抵御反射攻击
 * @Date 2019-08-24 21:24
 */
public class SingleTest2 {
    private static volatile SingleTest2 singleTest2;

    private SingleTest2() {
    }

    public static SingleTest2 getInstance() {
        if (singleTest2 == null) {
            synchronized (SingleTest2.class) {
                if (singleTest2 == null) {
                    singleTest2 = new SingleTest2();
                }
            }
        }
        return singleTest2;
    }

    public static void main(String[] args) throws Exception {
        SingleTest2 s1 = SingleTest2.getInstance();
        SingleTest2 s2 = SingleTest2.getInstance();
        System.out.println(s1 == s2);
        Constructor<SingleTest2> constructor = SingleTest2.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTest2 single = constructor.newInstance();

        System.out.println(s1 == single);
        System.out.println(s2 == single);
    }
}
