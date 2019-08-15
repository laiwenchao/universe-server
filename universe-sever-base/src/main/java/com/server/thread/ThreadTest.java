package com.server.thread;

import com.server.SignalTest;
import org.springframework.util.StringUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author laiwenchao
 * @Classname ThreadTest
 * @Description
 * @Date 2019-07-14 14:55
 */
public class ThreadTest {

    private final static ThreadLocal<String> threadLocal = SignalTest.threadlocal;

    public static void main(String[] args) throws Exception {

        //setVal();
        String aa = "abcdef";
        System.out.println(reverse(aa));
    }

    public static String reverse(String aa){
        if(StringUtils.isEmpty(aa)){
            return aa;
        }
        return reverse(aa.substring(1)) + aa.charAt(0);
    }


}
