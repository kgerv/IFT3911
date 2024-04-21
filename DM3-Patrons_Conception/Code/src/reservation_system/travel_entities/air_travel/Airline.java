package reservation_system.travel_entities.air_travel;

import reservation_system.travel_entities.Company;
import reservation_system.visitor.Visitor;

public class Airline extends Company {

    public Airline(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}