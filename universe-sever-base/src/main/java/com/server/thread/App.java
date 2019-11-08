package com.server.thread;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author laiwenchao
 * @Classname App
 * @Description 两个线程交替按序打印1-100
 * <p>
 * 输出示例：
 * Thread-1: 1
 * Thread-2: 2
 * Thread-1:3
 * 。。。
 * Thread-2：100
 * @Date 2019-10-26 14:40
 */
public class App {

    private static int i = 0;
    /**
     * @Author laiwenchao
     * @Description 两个线程交替按序打印1-100
     * @Date 2019-10-26 16:38
     **/
    public void print1to100() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    while (i < 100) {
                        // 唤醒另一个线程
                        notify();
                        i++;
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        try {
                            wait();//休眠
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    /**
     * @return java.util.List<T>
     * @Author laiwenchao
     * @Description 取出两个list中的差集
     * @Date 2019-10-26 16:38
     * @Param [list1, list2]
     **/
    public <T extends Comparable<T>> List<T> pickDiff(List<T> list1, List<T> list2) {
        if (CollectionUtils.isEmpty(list1) || CollectionUtils.isEmpty(list2)) {
            return new ArrayList<T>();
        }
        //集合结果返回
        List<T> resultList = new ArrayList<T>();
        //list1过滤元素
        List<T> diffPart1 = list1.stream().distinct().filter(t -> !list2.contains(t)).collect(Collectors.toList());
        //list2过滤元素
        List<T> diffPart2 = list2.stream().distinct().filter(t -> !list1.contains(t)).collect(Collectors.toList());
        resultList.addAll(diffPart1);
        resultList.addAll(diffPart2);
        return resultList;
    }
}
