package com.server.thread;

import org.springframework.util.StringUtils;

/**
 * @author laiwenchao
 * @Classname ThreadTest
 * @Description
 * @Date 2019-07-14 14:55
 */
public class ThreadTest {

    public static void main(String[] args) throws Exception {

        Thread.currentThread().interrupt();
        System.out.println("是否停止 1？="+Thread.interrupted());
        System.out.println("是否停止 2？="+Thread.interrupted());
        System.out.println("是否停止 3？="+Thread.interrupted());
        System.out.println("是否停止 3？="+Thread.interrupted());
        System.out.println("end!");

    }

    public void test() throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("i=" + i);
                }
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        Thread.sleep(500);
        t.interrupt();

    }


}
