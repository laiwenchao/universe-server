package com.server;

/**
 * @author laiwenchao
 * @Classname AppTest
 * @Description
 * @Date 2019-10-26 11:47
 */
public class AppTest {
    public static void main(String[] args) {
        String s = "asdfs";
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                System.out.println(s.substring(i, j+1));
            }
        }
    }
}
