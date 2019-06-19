package com.server.guava.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;

/**
 * @Description: 使用场景元素计数，元素无序可重复
 * @Author: laiwenchao02
 * @Date: 2019/3/20 下午10:00
 */
public class MultisetBase {
    public static void main(String[] args) {
        HashMultiset<String> multiset =
                HashMultiset.create(Lists.newArrayList("a", "a", "d", "d", "b"));
        multiset.add("b", 3);
        for (String key : multiset.elementSet()) {
            System.out.println(key + ":" + multiset.count(key));
        }

    }
}
