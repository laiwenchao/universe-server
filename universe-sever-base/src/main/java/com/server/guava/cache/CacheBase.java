package com.server.guava.cache;

import com.google.common.cache.*;
import com.server.domain.Woman;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/8 下午6:16
 */
public class CacheBase {
    private static final LoadingCache<String, Woman> cacheBuilder = CacheBuilder.newBuilder()
            .maximumSize(100)//定义对象个数的限制
            .initialCapacity(10)//设置缓存容器的初始容量为10
            .expireAfterAccess(3, TimeUnit.HOURS)//设置时间对象没有被读/写访问则对象从内存中删除
            .concurrencyLevel(8)//设置并发级别为8，并发级别是指可以同时写缓存的线程数
            .recordStats()//设置要统计缓存的命中率
            .removalListener(new RemovalListener() {//设置缓存的移除通知
                @Override
                public void onRemoval(RemovalNotification notification) {
                    System.out.println("remove:" + notification.getKey() + ":" + notification.getCause());
                }
            }).build(new CacheLoader<String, Woman>() {
                //build方法中可以指定CacheLoader，在缓存不存在时通过CacheLoader的实现自动加载缓存
                @Override
                public Woman load(String key) throws Exception {
                    Woman man = new Woman("default", 0);
                    System.out.println("rebuild");
                    return man;
                }
            });

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            cacheBuilder.put("xiao" + i, new Woman("xiao" + i, i));
        }

        for (int i = 0; i < 10; i++) {
            try {
                Woman man = cacheBuilder.get("xiao" + i);
                Thread.sleep(1000);
                System.out.println(man);
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
