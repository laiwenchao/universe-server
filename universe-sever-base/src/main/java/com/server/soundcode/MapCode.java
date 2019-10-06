package com.server.soundcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author laiwenchao
 * @Description hashmap源码解读 https://www.cnblogs.com/xiaoxi/p/7233201.html
 * 通过 (数组桶长度-1) & hash 得到元素存放的位置
 * @Date 2019-07-01 17:42
 **/
public class MapCode {
    static final int MAXIMUM_CAPACITY = 1 << 30;
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("", 1);
        map.get("");
    }
}
