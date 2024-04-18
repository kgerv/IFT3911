package ReservationSystem.TravelEntities.Cruise;

import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Visitor.Visitor;

public class Cruiseship extends Vehicle {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}