package com.server.java23.factory.abstraction;

import com.server.java23.factory.abstraction.domain.Fruit;
import com.server.java23.factory.abstraction.domain.Vegetables;
import com.server.java23.factory.abstraction.impl.NorthFactory;
import com.server.java23.factory.abstraction.impl.SouthFactory;

public class App {
    public static void main(String[] args) {

        AbstractFactory factory = new NorthFactory();
        Fruit appleFruit = factory.createFruit("苹果");
        appleFruit.color();
        Fruit orangeFruit = factory.createFruit("橘子");
        orangeFruit.color();

        Vegetables vegetables = factory.createVegetable();
        vegetables.taste();

        System.out.println("====================");

        AbstractFactory southFactory = new SouthFactory();
        Fruit sappleFruit = southFactory.createFruit("苹果");
        sappleFruit.color();
        Fruit sorangeFruit = southFactory.createFruit("橘子");
        sorangeFruit.color();

        Vegetables svegetables = southFactory.createVegetable();
        svegetables.taste();

    }
}
