package com.server;

import com.server.exception.Annoyance;
import com.server.exception.Sneeze;
import org.springframework.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        LinkedList<String> list = new LinkedList<String>();
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
