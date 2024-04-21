package reservation_system.travel_entities;

import reservation_system.visitor.Visitor;

public class SeatSection extends IndividualSection {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}