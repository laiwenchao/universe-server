package com.leetcode.string;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/15 18:13
 */
public class Huiwen {
    public static void main(String[] args) {
        isPalindrome("abcd efg");
    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c :chars){
            if(c>='0' && c<='9' ||c>='a' && c<='z'){
                sb.append(c);
            }
        }
        sb.toString().equals(sb.reverse().toString());
        System.out.println(chars);
        return true;
    }
}
