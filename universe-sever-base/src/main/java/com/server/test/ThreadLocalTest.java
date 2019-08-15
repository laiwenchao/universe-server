package com.server.test;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author laiwenchao
 * @Classname ThreadLocalTest
 * @Description
 * @Date 2019-08-14 15:18
 */
public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {
        //inheritableThreadLocalTest();
        transmittableThreadLocalTest();
    }

    public static void inheritableThreadLocalTest() throws InterruptedException {
        InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<String>();
        threadLocal.set("aaa");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(threadLocal.get());
                    threadLocal.set("newValue");
                    System.out.println(threadLocal.get());
                    System.out.println("==========");
                }finally {
                    threadLocal.remove();
                }

            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(runnable);
        Thread.sleep(1000);
        executorService.submit(runnable);

        Thread.sleep(1000);
        System.out.println(threadLocal.get());

        /*InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<String>();
        new Thread();*/
    }

    public static void transmittableThreadLocalTest() throws InterruptedException {
        TransmittableThreadLocal<String> threadLocal = new TransmittableThreadLocal<String>();
        threadLocal.set("aaa");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(threadLocal.get());
                    threadLocal.set("newValue");
                    System.out.println(threadLocal.get());
                    System.out.println("==========");
                }finally {
                    threadLocal.remove();
                }

            }
        };
        TtlRunnable ttlRunnable = TtlRunnable.get(runnable);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(ttlRunnable);
        Thread.sleep(1000);
        executorService.submit(ttlRunnable);

        Thread.sleep(1000);
        System.out.println(threadLocal.get());
    }
}
