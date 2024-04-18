package ReservationSystem.TravelEntities.Cruise;

import ReservationSystem.TravelEntities.Company;
import ReservationSystem.Visitor.Visitor;

public class CruiseLine extends Company {
    public CruiseLine(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}