package com.server.guava.collection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/20 下午9:38
 */
public class ImmutableBase {
    public static void main(String[] args) {
        ImmutableSet set = ImmutableSortedSet.of("d", "b", "e", "a", "d", "b");
        set.forEach(System.out::println);

        ImmutableList ll = ImmutableList.builder().add("a").add("b").build();
        ll.forEach(System.out::println);

        ImmutableList immutableList = ImmutableList.copyOf(ll);
        immutableList.forEach(System.out::println);

        ImmutableList list = ll.asList();
        list.forEach(System.out::println);

        System.out.println(ll == immutableList);
        System.out.println(ll == list);
        System.out.println(immutableList == list);
    }
}
