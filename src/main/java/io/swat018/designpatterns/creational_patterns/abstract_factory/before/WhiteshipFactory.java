package io.swat018.designpatterns.creational_patterns.abstract_factory.before;

import io.swat018.designpatterns.creational_patterns.factorymethod.after.DefaultShipFactory;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.Ship;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
