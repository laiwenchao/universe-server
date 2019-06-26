package com.server.java23;

import com.server.java23.strategy.GoHome;
import com.server.java23.strategy.Vehicle;
import com.server.java23.strategy.impl.Airplane;
import com.server.java23.strategy.impl.Car;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/6/17 下午9:41
 */
public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Airplane();
        GoHome goHome = new GoHome(vehicle);
        goHome.gohome();

        System.out.println("=======================");
        
        Vehicle car = new Car();
        goHome.setVehicle(car);
        goHome.gohome();
    }

}
