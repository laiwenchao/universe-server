package com.server.effect;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/5/9 下午6:20
 */
public class App {
    public static void main(String[] args) {

        ThreadLocal threadLocal = new ThreadLocal<String>();
        System.out.println(threadLocal.get());
        threadLocal.set("aa");


    }
}
