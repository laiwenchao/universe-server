package com.server.java23.strategy.impl;

import com.server.java23.strategy.Vehicle;

public class Airplane implements Vehicle {
    @Override
    public void go() {
        System.out.println("乘飞机回家");
    }
}
