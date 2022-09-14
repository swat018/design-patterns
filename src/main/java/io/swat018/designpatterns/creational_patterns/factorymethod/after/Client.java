package io.swat018.designpatterns.creational_patterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "swat018@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "mail@gmail.com");
        System.out.println(blackShip);
    }
}
