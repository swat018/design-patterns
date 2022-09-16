package io.swat018.designpatterns.creational_patterns.factorymethod.after;

public class WhiteShipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
