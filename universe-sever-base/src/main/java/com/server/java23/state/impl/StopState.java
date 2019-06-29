package com.server.java23.state.impl;

import com.server.java23.state.LiftState;

/**
 * @author laiwenchao
 * @Classname StopState
 * @Description
 * @Date 2019-06-29 17:19
 */
public class StopState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void running() {

    }

    @Override
    public void stop() {
        System.out.println("启动停止程序，电梯为停止状态");
    }
}
