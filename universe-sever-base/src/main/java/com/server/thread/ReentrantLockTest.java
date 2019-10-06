package com.server.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author laiwenchao
 * @Classname ReentrantLockTest
 * @Description
 * @Date 2019-10-02 20:19
 */
public class ReentrantLockTest {
    private final int aa;
    public static void main(String[] args) {

    }

    ReentrantLockTest(){
        aa = 2;
    }

    public void test(){
        ReentrantLock lock = new ReentrantLock();
        try {
            lock.tryLock(1, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
