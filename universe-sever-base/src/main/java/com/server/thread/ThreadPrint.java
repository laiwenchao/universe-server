package com.server.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author laiwenchao
 * @Classname ThreadPrint
 * @Description
 * @Date 2019-10-26 16:28
 */
public class ThreadPrint {
    private static volatile AtomicInteger atomicInteger = new AtomicInteger(0);
    private static volatile boolean isCanPrint = true;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (isCanPrint && atomicInteger.get() < 100) {
                    int val = atomicInteger.incrementAndGet();
                    System.out.println(Thread.currentThread().getName() + ":" + val);
                }
            }
        });
    }
}
