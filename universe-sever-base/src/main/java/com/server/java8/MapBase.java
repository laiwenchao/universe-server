package com.server.java8;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.server.domain.Student;

import java.util.List;
import java.util.Map;

/**
 * @Description: Map新特性
 * @Author: laiwenchao02
 * @Date: 2019/3/15 下午2:47
 */
public class MapBase {

    private final static List<Student> list = Lists.newArrayList(
            new Student("张三", 21, "男"),
            new Student("李四", 12, "女"),
            new Student("王二", 23, "男"),
            new Student("赵六", 34, "女"),
            new Student("袁天罡", null, null));

    public static void main(String[] args) {
        //merge();
        //computeIfAbsent();
    }

    public static void merge() {
        Map<String, Integer> map = Maps.newHashMap();
        list.forEach(student -> {
            map.merge(student.getGender(), student.getAge(), (a, b) -> a + b);
        });
        System.out.println(JSON.toJSONString(map));
    }

    public static void computeIfAbsent() {

        Map<String, List<Student>> map = Maps.newHashMap();
        list.forEach(student -> {
            /*if (!map.containsKey(student.getGender())) {
                map.put(student.getGender(), Lists.newArrayList());
            }*/
            List<Student> studentList =
                    map.computeIfAbsent(student.getGender(), a -> Lists.newArrayList());
            studentList.add(student);
        });
        System.out.println(JSON.toJSONString(map));
    }
}
