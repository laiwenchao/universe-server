package com.server.java23.state.impl;

import com.server.java23.state.LiftState;

/**
 * @author laiwenchao
 * @Classname Context
 * @Description
 * @Date 2019-06-29 16:46
 */
public class Context {

    //定义出所有的电梯状态,实际工程中可用@Resource
    public final static OpenningState OPENNING_STATE = new OpenningState();
    public final static CloseingState CLOSEING_STATE = new CloseingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StopState STOP_STATE = new StopState();


    private LiftState liftState = new StopState();//电梯默认为停止状态

    public void setLiftState(LiftState liftState) {
        //设置当前电梯状态
        this.liftState = liftState;
        //把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void running() {
        liftState.running();
    }

    public void stop() {
        liftState.stop();
    }

    public LiftState getLiftState() {
        return liftState;
    }


}
