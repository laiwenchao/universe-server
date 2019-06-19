package com.server.java23.adapter;

import java.io.*;

/**
 * 适配器模式
 * <p>
 * 把一个api转换成另一个api，强调的是变化
 * 用意是改变所考虑对象的接口
 */
public class App {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);//Adapter是一个适配器，它让Adaptee的api变成了Target的api
        target.originMethod();//有原有的方法
        target.targetMethod();//还有了目标的方法
    }


    public static void exampleInputStreamReader() throws FileNotFoundException {
        InputStream in = new FileInputStream("D:\\demo.txt");
        //InputStreamReader是一个适配器，它把InputStream的api转换成了Reader的api
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(isr);
    }
}
