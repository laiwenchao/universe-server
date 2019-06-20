package com.server.test;

import com.server.test.domin.Card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/5/2 下午1:21
 */
public class App {

    public static void main(String[] args) {
        //test1();
        System.out.println("fdfd");
    }

    public static void test1(){
        int[] arr = {1,2,3,4,5,6};
        List aa = Arrays.asList(arr);
        System.out.println(aa);
        System.out.println(Arrays.toString(arr));

        Collections.emptyList();
    }

    public static void test2(){
        Card card = new Card();
        card.setName("bb");
        card.setAge(12);
        Card [] cards = {card};
        List aa = Arrays.asList(cards);
        System.out.println(aa);
        System.out.println(Arrays.toString(cards));
    }
}
