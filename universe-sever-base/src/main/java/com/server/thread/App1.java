package com.server.thread;

import com.google.common.collect.Sets;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author laiwenchao
 * @Classname App1
 * @Description
 * @Date 2019-10-26 15:48
 */
public class App1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 2,
                10L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3));
    }


}
