package ReservationSystem.TravelEntities;

import ReservationSystem.Visitor.Visitor;

public class CabinSection extends GroupSection {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}