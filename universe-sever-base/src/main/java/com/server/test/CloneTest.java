package com.server.test;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/4/25 下午9:01
 */
public class CloneTest implements Cloneable {
    private final String name;
    private final CloneTest2 cloneTest2;

    public CloneTest(String name) {
        this.name = name;
        cloneTest2 = null;
    }


    public void test() {
        //name = "aaa";
        try {
            cloneTest2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
