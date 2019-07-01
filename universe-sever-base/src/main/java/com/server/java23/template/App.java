package com.server.java23.template;

import com.server.java23.template.impl.EggsWithTomatoCooking;

/**
 * @author laiwenchao
 * @Classname App
 * @Description 模板模式
 * @Date 2019-06-29 15:58
 */
public class App {
    public static void main(String[] args) {
        CookingTemplate cookingTemplate = new EggsWithTomatoCooking();
        cookingTemplate.fire();
        cookingTemplate.doCooking();
    }
}
