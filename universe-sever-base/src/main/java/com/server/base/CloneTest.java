package com.server.base;

import com.server.base.domain.Cat;
import com.server.base.domain.Dog;
import com.server.base.domain.Pig;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/25 下午6:09
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig();
        pig.setName("佩奇");
        pig.setAge(1);
        pig.setCat(new Dog());

        Pig pp = (Pig) pig.clone();
        System.out.println(pp == pig);
    }
}
