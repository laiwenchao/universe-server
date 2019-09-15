package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/26 23:33
 */
public class App {
    public static void main(String[] args) {
        //String s = "cdbbdk";
        String s = "babad";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int aa = getLen(s, i, i);
            int bb = getLen(s, i, i + 1);

            int len = Math.max(aa, bb);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        String aa = s.substring(start, end + 1);

        System.out.println(aa);

    }

    public static int getLen(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;

    }
}
