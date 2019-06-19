package com.server.guava.base;

import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.server.domain.Man;
import com.server.domain.Persion;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/2/23 下午3:59
 */
public class GuavaBase {
    public static void main(String[] args) {
        Persion persion = new Persion();
        /*optionalTest(persion);
        optionalTest(null);*/
        //orderingTest();
        Integer i = 10;
        BigDecimal bigDecimal = new BigDecimal("12.123");
        BigDecimal result = bigDecimal.multiply(new BigDecimal(String.valueOf(i)));
        System.out.println(result);

        Preconditions.checkArgument(5 < 2, "5 < 2不正确");
        Man man = null;
        Preconditions.checkNotNull(man, "为空");
    }

    public static void optionalTest(Persion persion) {

        Preconditions.checkNotNull(persion, "persion参数为空");
        Optional<Persion> optional = Optional.ofNullable(persion);
        if (optional.isPresent()) {
            Persion persion1 = optional.get();
            System.out.println("persion1:" + persion1);
        }
    }

    public static void comparisonChainTest() {
        List<Persion> list = Lists.newArrayList();
        list.add(new Persion("lichao", 12));
        list.add(new Persion("xiaoming", 10));
        list.add(new Persion("zhangsan", 11));

        Collections.sort(list, (p1, p2) -> {
            return ComparisonChain.start()
                    .compare(p2.getAge(), p1.getAge()).result();
        });

        list.forEach(persion -> {
            System.out.println(persion);
        });
        /*Ordering<Persion> ordering = Ordering.natural().nullsLast();
         */
    }

    public static void orderingTest() {
        List<Man> list = Lists.newArrayList();
        list.add(new Man("lichao", 12));
        list.add(new Man("xiaoming", 10));
        list.add(new Man("zhangsan", 11));
        list.add(null);

        Ordering<Man> ordering = Ordering.natural().nullsLast();
        List<Man> es = ordering.sortedCopy(list);
        es.forEach(man -> {
            System.out.println(man);
        });

    }

    public static void object() {
        List<Man> list = Lists.newArrayList();
        Objects.requireNonNull(list, "空值");
        Objects.isNull(list);
        Objects.nonNull(list);
    }
}
