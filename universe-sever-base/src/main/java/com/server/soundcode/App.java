package com.server.soundcode;

import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
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

        //kv是单链表
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("", "");
        hashtable.get("");
        hashtable.toString();

        //kv是单链表
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("", "");
        hashMap.get("");
        hashMap.remove("");

        //kv是单链表
        LinkedHashMap<String, String> linkedHashMap =
                new LinkedHashMap<String, String>();
        linkedHashMap.put("","");
        linkedHashMap.get("");

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap();
        map.put("","");
        map.get("");

        CopyOnWriteArrayList<String> copyList = new CopyOnWriteArrayList();
        copyList.add("");
        copyList.get(2);


        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("", "");
        treeMap.get("");
        treeMap.remove("");

        //Object数组 看MyArrayList代码 扩容1.5n
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.get(2);
        list.remove("");

        //双向链表
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("");
        linkedList.get(3);
        linkedList.peek();
        linkedList.offer("dd");
        linkedList.addFirst("");


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
