package com.server.guava.string;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;

import java.util.List;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/8 下午9:08
 */
public class StringBase {
    private static String line = "lai, wench  ,,,ao 赖a文aa超";

    public static void main(String[] args) {
        spliter();
        joiner();
    }

    public static void spliter() {
        List<String> list = Splitter.on(',').omitEmptyStrings().trimResults().splitToList(line);
        list.forEach(str -> System.out.println(str));
    }

    public static void joiner() {
        String string = Joiner.on(',').skipNulls()
                .join("aa", null, "ff", "dfd");
        System.out.println(string);
    }
}
