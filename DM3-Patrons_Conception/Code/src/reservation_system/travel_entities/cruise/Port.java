package reservation_system.travel_entities.cruise;

import reservation_system.travel_entities.Facility;
import reservation_system.visitor.Visitor;

public class Port extends Facility {
    public Port(String id, String name, String city, String country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}