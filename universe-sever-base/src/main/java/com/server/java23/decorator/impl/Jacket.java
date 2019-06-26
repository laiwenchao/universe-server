package com.server.java23.decorator.impl;

import com.server.java23.decorator.Clothing;
import com.server.java23.decorator.Person;

/**
 * @author laiwenchao
 * @Classname Jacket
 * @Description 夹克
 * @Date 2019-06-26 21:16
 */
public class Jacket extends Clothing {

    public Jacket(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.person.wear();
        wearJacket();
    }

    public void wearJacket() {
        System.out.println("穿上了夹克");
    }
}
