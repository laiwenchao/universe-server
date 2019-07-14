package com.server.thread;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/8 下午9:32
 */
public class ExecutorCompletionService {
    public static void main(String[] args) {
        ExecutorCompletionService service = new ExecutorCompletionService();
        try {
            service.wait();
            service.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
