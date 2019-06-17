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
