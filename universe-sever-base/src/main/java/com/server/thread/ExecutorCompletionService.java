package com.server.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/8 下午9:32
 */
public class ExecutorCompletionService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        String data = "aaabbbcccdddeeefffggghhhiiijjjkkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzz";

        ConcurrentHashMap<String, Integer> map =
                new ConcurrentHashMap<String, Integer>();

        int pre = 0;
        int last = 0;
        for (int i = 0; i < data.length(); i++) {
            if (i % 10 == 0) {
                last = i;
                int finalPre = pre;
                int finalLast = last;
                Future<Map<String, Integer>> future = executorService.submit(new Callable<Map<String, Integer>>() {
                    @Override
                    public Map<String, Integer> call() throws Exception {
                        Map<String, Integer> map = new HashMap<String, Integer>();
                        String values = data.substring(finalPre, finalLast);
                        for (char str : values.toCharArray()) {
                            if (map.get(str) == null) {
                                map.put(Character.toString(str), 1);
                            } else {
                                map.put(Character.toString(str), map.get(Character.toString(str)) + 1);
                            }
                        }
                        return map;
                    }
                });
                pre = last;
            }

        }


    }
}
