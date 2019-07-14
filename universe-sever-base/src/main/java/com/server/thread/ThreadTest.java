package com.server.thread;

/**
 * @author laiwenchao
 * @Classname ThreadTest
 * @Description
 * @Date 2019-07-14 14:55
 */
public class ThreadTest {
    public static void main(String[] args) {

    }

    public void testThread(){
        Thread thread = new Thread();
        thread.start();

        Thread.holdsLock(this);
    }
}
