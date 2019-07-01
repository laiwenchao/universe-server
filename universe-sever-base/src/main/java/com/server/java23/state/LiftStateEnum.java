package com.server.java23.state;

/**
 * @author laiwenchao
 * @Classname LiftStateEnum
 * @Description
 * @Date 2019-06-29 16:41
 */
public enum LiftStateEnum {

    CLOSE(0,"关闭"),
    OPEN(1,"开启"),
    RUNNING(2,"运行"),
    STOP(3,"停止");

    private int state;
    private String desc;

    LiftStateEnum(int state, String desc) {
        this.state = state;
        this.desc = desc;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
