package com.server;

import com.google.common.collect.Sets;
import com.server.base.domain.Bird;

import java.io.File;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bird b1 = new Bird();
        b1.setAge(1);

        Bird b2 = new Bird();
        b2.setAge(2);
        Set<Bird> set = Sets.newTreeSet();
        set.add(b2);
        set.add(b1);

        Integer integer = new Integer(3);
        integer.intValue();
        System.out.println(set);

        BigInteger bigInteger = new BigInteger("2");
        bigInteger.negate();

        String aa = "aabbccddeeff";
        String bb = "aabbccddeeff";
        String cc = bb;
        System.out.println(aa==bb);
        System.out.println(cc==bb);
        System.out.println(cc==aa);

        new Properties();
        Executors.newCachedThreadPool();
        Calendar.getInstance();
    }
}
