package com.server.soundcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author laiwenchao
 * @Classname ListAndSetCode
 * @Description
 * @Date 2019-08-17 11:40
 */
public class ListAndSetCode {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.remove("");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("");treeSet.first();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("");hashSet.remove("");

        ThreadLocal threadLocal = new ThreadLocal<>();
        threadLocal.set("");
        threadLocal.get();

        InheritableThreadLocal threadLocal1 = new InheritableThreadLocal<>();
        threadLocal1.set("");
        threadLocal1.get();
    }
}
