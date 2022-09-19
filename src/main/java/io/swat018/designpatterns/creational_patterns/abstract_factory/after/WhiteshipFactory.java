package io.swat018.designpatterns.creational_patterns.abstract_factory.after;

import io.swat018.designpatterns.creational_patterns.abstract_factory.before.WhiteAnchor;
import io.swat018.designpatterns.creational_patterns.abstract_factory.before.WhiteWheel;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.DefaultShipFactory;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.Ship;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;


    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
