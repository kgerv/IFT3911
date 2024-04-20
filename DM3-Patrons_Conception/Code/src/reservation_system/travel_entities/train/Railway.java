package reservation_system.travel_entities.train;

import reservation_system.travel_entities.Company;
import reservation_system.visitor.Visitor;

public class Railway extends Company {
    public Railway(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}