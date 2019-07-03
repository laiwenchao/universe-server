package com.server.soundcode;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author laiwenchao
 * @Classname ConcurrentHashMapCode
 * @Description https://www.cnblogs.com/zerotomax/p/8687425.html
 * get不加锁如何保证同步的 https://www.cnblogs.com/keeya/p/9632958.html
 * @Date 2019-07-03 14:11
 */
public class ConcurrentHashMapCode {
    public static void main(String[] args) {

        new ConcurrentHashMap<String,String>();
    }
}
