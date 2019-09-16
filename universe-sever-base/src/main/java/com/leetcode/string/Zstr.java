package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author laiwenchao
 * @Classname Zstr
 * @Description 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * <p>
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * @Date 2019-09-15 20:16
 */
public class Zstr {
    public static void main(String[] args) {
        String aa = convert("LEETCODEISHIRING", 4);
        System.out.println(aa);
    }

    public static String convert(String s, int numRows) {

        if(s.length()==1){
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0) {
                goingDown = true;
            }
            if (curRow == (numRows - 1)) {
                goingDown = false;
            }
            curRow += goingDown ? 1 : -1;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder part : rows) {
            sb.append(part);
        }
        return sb.toString();
    }
}
