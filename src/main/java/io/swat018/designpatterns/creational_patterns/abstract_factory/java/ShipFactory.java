package io.swat018.designpatterns.creational_patterns.abstract_factory.java;

import io.swat018.designpatterns.creational_patterns.factorymethod.after.Ship;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
