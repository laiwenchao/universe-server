package com.server.java23.strategy.impl;

import com.server.java23.strategy.Vehicle;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("乘汽车回家");
    }
}
