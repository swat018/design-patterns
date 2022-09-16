package io.swat018.designpatterns.creational_patterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "swat018@gmail.com");
        client.print(new BlackShipFactory(), "blackship", "email@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
