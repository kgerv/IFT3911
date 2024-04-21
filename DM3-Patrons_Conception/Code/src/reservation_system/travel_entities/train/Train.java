package reservation_system.travel_entities.train;

import reservation_system.travel_entities.Vehicle;
import reservation_system.visitor.Visitor;

public class Train extends Vehicle {

    public Train(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}