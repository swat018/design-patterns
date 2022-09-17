package io.swat018.designpatterns.creational_patterns.factorymethod.java;

import io.swat018.designpatterns.creational_patterns.factorymethod.after.BlackShip;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.WhiteShip;

public class SampleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
