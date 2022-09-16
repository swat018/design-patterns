package io.swat018.designpatterns.creational_patterns.factorymethod.after;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
