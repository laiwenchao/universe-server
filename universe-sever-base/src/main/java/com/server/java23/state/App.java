package com.server.java23.state;

import com.server.java23.state.impl.CloseingState;
import com.server.java23.state.impl.Context;

/**
 * @author laiwenchao
 * @Classname App
 * @Description 状态模式，对可能获取的状态创建一个状态的子类，状态变化时，改变成相应的子类
 * https://blog.csdn.net/u012401711/article/details/52675873
 * @Date 2019-06-29 16:27
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseingState());//关闭状态
        context.open();//上电梯
        context.close();//关闭状态
        context.running();//电梯运行
        //context.open();//打开运行,这部会异常
        context.stop();//电梯停止
        context.open();//电梯打开
        context.close();//关门

    }
}
