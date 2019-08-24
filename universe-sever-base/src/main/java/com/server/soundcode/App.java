package com.server.soundcode;

import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/**
 * @author laiwenchao
 * @Classname App
 * @Description
 * @Date 2019-08-21 20:47
 */
public class App {



    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.get();
        atomicInteger.addAndGet(2);

        new Object();

        //
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        hashtable.put("","");
        hashtable.get("");
        hashtable.toString();

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("","");
        hashMap.get("");

        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.put("","");
        treeMap.get("");
        treeMap.remove("");

        //看MyArrayList代码 扩容1.5n
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.get(2);
        list.remove("");

        //内部使用TreeMap
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("treeset");
        treeSet.remove("treeset");

        //内部使用HashMap
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("aa");
        hashSet.remove("aa");



        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.get();
        threadLocal.set("aaa");

        LockSupport.park();
    }
}
