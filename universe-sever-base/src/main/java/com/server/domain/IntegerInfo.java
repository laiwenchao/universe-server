package com.server.domain;

/**
 * @author laiwenchao
 * @Classname IntegerInfo
 * @Description
 * @Date 2019-08-27 15:08
 */
public class IntegerInfo {
    private int i;

    public IntegerInfo(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "IntegerInfo{" +
                "i=" + i +
                '}';
    }
}
