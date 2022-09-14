package io.swat018.designpatterns.creational_patterns.factorymethod.after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
