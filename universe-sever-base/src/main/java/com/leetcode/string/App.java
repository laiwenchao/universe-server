package com.leetcode.string;

import java.util.Stack;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/15 22:54
 */
public class App {
    public static void main(String[] args) {
        char[] chars = "abcd".toCharArray();
        for(char c :chars){
            System.out.println(c);
        }
    }

    /**
     * @Description  数组最长子串前缀
     * @author laiwenchao
     * @date 2019/9/16 0:16
     * @param
     * @return java.lang.String
    */
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            int j = 0;
            for (; j < ans.length() && j< cur.length(); j++) {
                if (ans.charAt(j) != cur.charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0,j);
        }
        return ans;
    }

    public boolean isValid(String s){
        if(s.length()<=1){
            return false;
        }
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(stack.size()==0){
                stack.push(c);
            }else if(valid(stack.peek(),c)){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean valid(char a,char b){
        if(a=='(' && b==')' || a=='[' && b==']' || a=='{' && b=='}') {
            return true;
        }
        return false;
    }
}
