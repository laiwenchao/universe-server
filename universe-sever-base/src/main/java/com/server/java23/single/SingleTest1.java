package com.server.java23.single;

/**
 * @author laiwenchao
 * @Classname SingleTest1
 * @Description
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
}
