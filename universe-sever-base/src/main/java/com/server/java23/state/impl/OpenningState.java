package com.server.java23.state.impl;

import com.server.java23.state.LiftState;
import com.server.java23.state.LiftStateEnum;

/**
 * @author laiwenchao
 * @Classname OpenningState
 * @Description 具体状态
 * @Date 2019-06-29 16:36
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("启动电梯门开启程序，电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSEING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void running() {
        System.out.println("抛异常 error:门是开启的，不能运行");
    }

    @Override
    public void stop() {
        System.out.println("门已经是停的");
    }
}
