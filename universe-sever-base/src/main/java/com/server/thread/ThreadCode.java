package com.server.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author laiwenchao
 * @Classname ThreadCode
 * @Description 线程源码分析
 * @Date 2019-07-14 14:58
 */
public class ThreadCode {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.run();

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String,String>();
        map.get("aa");
        map.put("aa","AA");

        CopyOnWriteArrayList list = new CopyOnWriteArrayList<String>();
        list.add("aa");
    }

}
