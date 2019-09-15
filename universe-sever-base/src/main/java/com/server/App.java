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
 *
 */
public class App 
{

    public static void main( String[] args ) throws Exception {
        System.out.println(32*0.75*2==32*2*0.75);
        System.out.println(Integer.MAX_VALUE);
    }

    public static void aa(int aa) throws InterruptedException {
        int cc = aa;
        Thread.sleep(3000);
        System.out.println(cc);
    }
    public void bb(int bb){

    }



    /**
     * @Author laiwenchao
     * @Description 递归反转字符串
     * @Date 2019-08-13 23:45
     * @Param [aa]
     * @return java.lang.String
     **/
    public static String reverse(String aa){
        if(StringUtils.isEmpty(aa)){
            return aa;
        }
        String result = reverse(aa.substring(1)) + aa.charAt(0);
        System.out.println(result);
        return result;
    }
}
