package com.server.java23.single;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author laiwenchao
 * @Classname SingleTest3
 * @Description
 * @Date 2019-08-24 21:26
 */
public enum SingleTest3 {

    INSTANCE;

    private final ExecutorService executorService;

    public ExecutorService getInstance() {
        return executorService;
    }

    private SingleTest3() {
        executorService = Executors.newCachedThreadPool();
        System.out.println("枚举构造方法只调用一次");
    }


}
