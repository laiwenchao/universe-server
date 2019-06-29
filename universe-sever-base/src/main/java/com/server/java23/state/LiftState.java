package com.server.java23.state;

import com.server.java23.state.impl.Context;

/**
 * @author laiwenchao
 * @Classname LiftState
 * @Description 电梯状态, 抽象状态类
 * @Date 2019-06-29 16:34
 */
public abstract class LiftState {

    //定义一个环境角色，也就是封装状态的变换引起的功能变化
    protected Context context;

    public abstract void open();

    public abstract void close();

    public abstract void running();

    public abstract void stop();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
