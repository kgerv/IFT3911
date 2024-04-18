package ReservationSystem.TravelEntities;

import ReservationSystem.Visitor.Visitor;

public class SeatSection extends IndividualSection {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}