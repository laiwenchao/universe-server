package com.server.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * @author laiwenchao
 * @Classname LockSupportTest
 * @Description
 * @Date 2019-08-24 19:47
 */
public class LockSupportTest {
    public static void main(String[] args) throws Exception {
        LockSupportTest lockSupportTest = new LockSupportTest();
        lockSupportTest.test();

    }

    public void testLockSupport() throws Exception {
        Thread thread = new Thread(() -> {
            LockSupport.park();
            System.out.println("aa");
        });

        thread.start();
        System.out.println("等3s");
        Thread.sleep(3000);
        LockSupport.unpark(thread);
    }

    public void test() throws Exception {
        final Thread thread = new Thread(() -> {
            System.out.println("thread run");
        });

        Thread thread1 = new Thread(() -> {
            synchronized (thread){
                while (true){
                    try {
                        System.out.println("开始wait");
                        thread.wait(100000);
                        System.out.println("wait end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        thread1.start();
        System.out.println("等3s");
        Thread.sleep(3000);
        thread.start();

    }
}
