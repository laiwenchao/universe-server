package com.server;

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

    public static void main( String[] args )
    {
        List<String> userNames = new CopyOnWriteArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            add("D");
        }};

        Iterator it = userNames.iterator();

        for (String userName : userNames) {
            if (userName.equals("B")) {
                userNames.remove(userName);
            }
        }

        System.out.println(userNames);

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(userNames);
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
