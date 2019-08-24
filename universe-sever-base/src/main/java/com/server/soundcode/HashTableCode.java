package com.server.soundcode;

import java.util.Hashtable;

/**
 * @author laiwenchao
 * @Classname HashTableCode
 * @Description
 * @Date 2019-08-22 22:00
 */
public class HashTableCode {
    public static void main(String[] args) {
        /**
         * 1、数据结构是链表数组：Entry[]
         *
         * final int hash;
         * final K key;
         * V value;
         * Entry<K,V> next;
         *
         * 2、初始Entry容量是11, 加载因子是0.75
         *
         * 3、扩容时 2n+1
         *
         *
         **/
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        hashtable.put("","");
        hashtable.get("");
        hashtable.toString();
    }
}
