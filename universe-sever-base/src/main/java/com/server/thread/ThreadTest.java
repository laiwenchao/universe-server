package com.server.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author laiwenchao
 * @Classname ThreadTest
 * @Description
 * @Date 2019-07-14 14:55
 */
public class ThreadTest {

    static volatile int num = 0;

    public static void main(String[] args) throws Exception {

        int prev = Integer.MIN_VALUE / 2;
        System.out.println(prev);

        /*ThreadTest threadTest = new ThreadTest();
        threadTest.test();*/
    }


    @SuppressWarnings("all")
    public void test() {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(100);
        for (int i = 0; i < 50; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (t1) {
                        num++;
                        System.out.println(Thread.currentThread().getName() + ":" + num);
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }

        for (int i = 0; i < 50; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (t2) {
                        num++;
                        System.out.println(Thread.currentThread().getName() + ":" + num);
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

}
