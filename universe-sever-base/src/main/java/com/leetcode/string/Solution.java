package com.leetcode.string;

import java.util.*;

/**
 * @Author laiwenchao
 * @Description
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * @date 2019/8/4 23:45
 */
public class Solution {
    public static void main(String[] args) {
        int len = lengthOfLongestSubstringMap("dvdf");
        System.out.println(len);
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int result = 0;
        int i = 0;
        int j = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return result;

    }

    public static int lengthOfLongestSubstringMap(String s) {

        int i=0;
        int result = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }
            map.put(s.charAt(j),j);
            result = Math.max(result,j-i+1);
        }
        return result;
    }
}
