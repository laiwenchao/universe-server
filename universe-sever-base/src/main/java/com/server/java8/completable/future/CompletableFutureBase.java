package com.server.java8.completable.future;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.*;
import java.util.function.*;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/15 下午9:04
 */
public class CompletableFutureBase {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        ExecutorService executor = new ThreadPoolExecutor(4, 4,
                0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadFactoryBuilder().setNameFormat("completable-pool-%d").build());

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "aa";
        }, executor).thenApplyAsync(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "bb";
            }
        });

        f1.applyToEitherAsync(f2, new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println(Thread.currentThread().getName() + ":::" + s);
                return s;
            }
        });

        f1.thenAcceptBothAsync(f2, new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(Thread.currentThread().getName() + ":::" + s + ":" + s2);
            }
        });

    }
}
