package io.swat018.designpatterns.creational_patterns.abstract_factory.after;

import io.swat018.designpatterns.creational_patterns.abstract_factory.before.WhiteAnchor;
import io.swat018.designpatterns.creational_patterns.abstract_factory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
