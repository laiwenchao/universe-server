package com.server.java23.single;

/**
 * @author laiwenchao
 * @Classname SingleTest2
 * @Description
 * @Date 2019-08-24 21:24
 */
public class SingleTest2 {
    private static volatile SingleTest2 singleTest2;

    private SingleTest2(){}

    public static SingleTest2 getInstance(){
        if(singleTest2 == null){
            synchronized (SingleTest2.class){
                if(singleTest2 == null){
                    singleTest2 = new SingleTest2();
                }
            }
        }
        return singleTest2;
    }
}
