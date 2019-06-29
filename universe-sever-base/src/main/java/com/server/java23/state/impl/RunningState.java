package com.server.java23.state.impl;

import com.server.java23.state.LiftState;

/**
 * @author laiwenchao
 * @Classname RunningState
 * @Description 电梯在运行状态下能做哪些动作
 * @Date 2019-06-29 17:20
 */
public class RunningState extends LiftState {

    //运行的时候开电梯门？你疯了！电梯不会给你开的
    @Override
    public void open() {
        System.out.println("抛异常 error: 运行中的电梯不能开门！");
    }

    //电梯门关闭？这是肯定了
    @Override
    public void close() {
        System.out.println("什么都不处理，门已经是关的了!");
    }

    @Override
    public void running() {
        System.out.println("启动运行程序，电梯正在运行。。。");
    }

    //这个事绝对是合理的，光运行不停止还有谁敢做这个电梯？！
    @Override
    public void stop() {
        //环境设置为停止状态；
        super.context.setLiftState(Context.STOP_STATE);
        super.context.getLiftState().stop();
    }
}
