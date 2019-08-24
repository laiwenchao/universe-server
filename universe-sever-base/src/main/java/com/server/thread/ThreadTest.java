package com.server.thread;

import org.springframework.util.StringUtils;

/**
 * @author laiwenchao
 * @Classname ThreadTest
 * @Description
 * @Date 2019-07-14 14:55
 */
public class ThreadTest {

    public static void main(String[] args) throws Exception {

        //setVal();
        String aa = "abcdef";
        System.out.println(reverse(aa));
    }

    public static String reverse(String aa){
        if(StringUtils.isEmpty(aa)){
            return aa;
        }
        return reverse(aa.substring(1)) + aa.charAt(0);
    }


}
