package com.server;

import com.server.domain.IntegerInfo;
import com.server.exception.Annoyance;
import com.server.exception.Sneeze;
import org.springframework.util.StringUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {


    }

    public int lengthOfLastWord(String s) {

        String[] arrs = s.split(" ");
        if(arrs==null || arrs.length==0){
            return 0;
        }
        String arr = arrs[arrs.length -1];
        return arr.length();
    }

    public static int binarySearch(int nums[], int key) {
        int max = nums.length;
        int min = 0;
        while (max >= min) {
            int mid = (max + min) / 2;
            if (nums[mid] > key) {
                max = mid;
            } else if (nums[mid] < key) {
                min = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void aa(int aa) throws InterruptedException {
        int cc = aa;
        Thread.sleep(3000);
        System.out.println(cc);
    }

    public void bb(int bb) {

    }


    /**
     * @return java.lang.String
     * @Author laiwenchao
     * @Description 递归反转字符串
     * @Date 2019-08-13 23:45
     * @Param [aa]
     **/
    public static String reverse(String aa) {
        if (StringUtils.isEmpty(aa)) {
            return aa;
        }
        String result = reverse(aa.substring(1)) + aa.charAt(0);
        System.out.println(result);
        return result;
    }
}
