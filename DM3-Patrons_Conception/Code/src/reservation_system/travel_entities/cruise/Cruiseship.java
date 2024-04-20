package reservation_system.travel_entities.cruise;

import reservation_system.travel_entities.Vehicle;
import reservation_system.visitor.Visitor;

public class Cruiseship extends Vehicle {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}