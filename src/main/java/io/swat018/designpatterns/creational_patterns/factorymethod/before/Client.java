package io.swat018.designpatterns.creational_patterns.factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("Whiteship", "swat018@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("Blackship", "swat018@gmail.com");
        System.out.println(blackShip);
    }
}
