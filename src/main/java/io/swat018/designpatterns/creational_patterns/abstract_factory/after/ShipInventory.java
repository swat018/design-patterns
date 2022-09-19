package io.swat018.designpatterns.creational_patterns.abstract_factory.after;


import io.swat018.designpatterns.creational_patterns.factorymethod.after.Ship;
import io.swat018.designpatterns.creational_patterns.factorymethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
