package com.server.base;

import com.server.base.domain.Cat;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/25 下午5:19
 */
public class StringTest {
    public static void main(String[] args) {
        intern2();
    }

    public static void intern1(){
        String a = new String("abc");//堆 0xaa
        a.intern();//常量池 0xbb
        String  b="abc";//b发现常量池中有这个数据，直接拿出对应的地址 0xbb
        System.out.println(a.intern()==a);//0xbb != 0xaa
        System.out.println(a.intern()==b);//0xbb == 0xbb
        System.out.println(b.intern()==b);//0xbb == 0xbb
        System.out.println(b.intern()==a.intern());//0xbb == 0xbb
        System.out.println(a==b);//0xaa == 0xbb

    }
    public static void intern2(){
        //常量池和堆中1，堆中有11
        String a=new String("1")+new String("1");
        a.intern();//常量池中有11
        System.out.println(a.intern() == a);
        String b="11";
        System.out.println(a==b);


    }

    public static void copyOfRange() {
        char[] chars = {'a', 'b', 'c'};
        char[] charCopy = Arrays.copyOfRange(chars, 1, 2);
        System.out.println(charCopy);
    }

    public static void messageFormat() {
        int num = 1;
        Cat cat = new Cat();
        cat.setName("xiaomiao");
        cat.setAge(2);

        String str = String.format("有%d 个，小猫:%s", num, cat);
        String aa = MessageFormat.format("有{0} 个，小猫:{1}", num, cat);
        System.out.println(str);
        System.out.println(aa);
    }
}
