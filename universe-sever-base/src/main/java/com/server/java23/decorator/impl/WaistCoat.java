package com.server.java23.decorator.impl;

import com.server.java23.decorator.Clothing;
import com.server.java23.decorator.Person;

/**
 * @author laiwenchao
 * @Classname WaistCoat
 * @Description 背心
 * @Date 2019-06-26 21:13
 */
public class WaistCoat extends Clothing {
    public WaistCoat(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.person.wear();
        wearWaistCoat();
    }

    public void wearWaistCoat() {
        System.out.println("穿上了背心");
    }
}
