package ReservationSystem.TravelEntities.Train;

import ReservationSystem.TravelEntities.Company;
import ReservationSystem.Visitor.Visitor;

public class Railway extends Company {
    public Railway(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}