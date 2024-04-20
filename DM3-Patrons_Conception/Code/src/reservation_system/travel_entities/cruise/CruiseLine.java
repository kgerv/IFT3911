package reservation_system.travel_entities.cruise;

import reservation_system.travel_entities.Company;
import reservation_system.visitor.Visitor;

public class CruiseLine extends Company {
    public CruiseLine(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}