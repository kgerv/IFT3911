package reservation_system.travel_entities.air_travel;

import reservation_system.travel_entities.Vehicle;
import reservation_system.visitor.Visitor;

public class Airplane extends Vehicle {

    public Airplane(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}