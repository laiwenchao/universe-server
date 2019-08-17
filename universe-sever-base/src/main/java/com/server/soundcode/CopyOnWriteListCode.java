package com.server.soundcode;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author laiwenchao
 * @Classname CopyOnWriteListCode
 * @Description
 * @Date 2019-08-17 11:46
 */
public class CopyOnWriteListCode {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        copyOnWriteArrayList.add("aa");
        copyOnWriteArrayList.get(0);
        copyOnWriteArrayList.iterator();
    }
}
