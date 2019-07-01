package com.server.java23.template;

/**
 * @author laiwenchao
 * @Classname CookingTemplate
 * @Description 做菜模板 做菜前、做菜中、做菜后
 *
 * @Date 2019-06-29 16:01
 */
public abstract class CookingTemplate {

    public void fire(){
        System.out.println("做菜前先开火");
    }

    public void doCooking(){
        preCooking();
        cooking();
        afterCooking();
    }
    public abstract void preCooking();

    public abstract void cooking();

    public abstract void afterCooking();
}
