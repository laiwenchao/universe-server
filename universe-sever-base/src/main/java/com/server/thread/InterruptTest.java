package com.server.thread;

/**
 * @author laiwenchao
 * @Classname InterruptTest
 * @Description
 * @Date 2019-11-04 11:05
 */
public class InterruptTest {
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
