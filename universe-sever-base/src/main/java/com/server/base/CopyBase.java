package com.server.base;

import com.server.base.domain.Cat;
import com.server.base.domain.Dog;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/12 上午11:14
 */
public class CopyBase {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Dog dog = new Dog();
        dog.setName("dog");
        dog.setAge(2);

        Cat cat = new Cat();
        BeanUtils.copyProperties(dog, cat);

        Cat cat1 = new Cat();
        PropertyUtils.copyProperties(cat1, dog);
        System.out.println(cat);
        System.out.println(cat1);

    }
}
