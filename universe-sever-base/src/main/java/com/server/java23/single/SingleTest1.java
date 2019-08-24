package com.server.java23.single;

import java.lang.reflect.Constructor;

/**
 * @author laiwenchao
 * @Classname SingleTest1
 * @Description 该单利不能抵御反射攻击
 * @Date 2019-08-24 21:19
 */
public class SingleTest1 {

    private SingleTest1(){}

    public static SingleTest1 getInstatnce(){
        return Single.singleTest1;
    }

    static private class Single {
        public final static SingleTest1 singleTest1 = new SingleTest1();
    }

    public static void main(String[] args) throws Exception {
        SingleTest1 s1 = SingleTest1.getInstatnce();
        SingleTest1 s2 = SingleTest1.getInstatnce();
        System.out.println(s1 == s2);
        Constructor<SingleTest1> constructor = SingleTest1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTest1 single = constructor.newInstance();

        System.out.println(s1 == single);
        System.out.println(s2 == single);
    }
}
