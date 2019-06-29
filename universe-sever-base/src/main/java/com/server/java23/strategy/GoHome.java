package com.server.java23.strategy;

public class GoHome {
    private Vehicle vehicle;

    public GoHome(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void gohome() {
        vehicle.go();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
