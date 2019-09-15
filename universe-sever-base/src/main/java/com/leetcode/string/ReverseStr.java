package com.leetcode.string;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/7 21:25
 */
public class ReverseStr {

    public static void main(String[] args) {
        String result = reverse("abcdefg");
        System.out.println(result);
        //System.out.println(result);
        //System.out.println("abcdefg".substring(1));

    }

    public static String reverse(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        char first = str.charAt(0);
        String part = reverse(str.substring(1));

        return part + first;
    }
}
