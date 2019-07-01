package com.server.java23.state.impl;

import com.server.java23.state.LiftState;
import com.server.java23.state.LiftStateEnum;

/**
 * @author laiwenchao
 * @Classname CloseingState
 * @Description
 * @Date 2019-06-29 16:56
 */
public class CloseingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("启动关闭程序，电梯门关闭。。。");
    }

    @Override
    public void running() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().running();
    }

    //电梯门关着，我就不按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.getLiftState().stop();
    }
}
