package ReservationSystem.TravelEntities.AirTravel;

import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Visitor.Visitor;

public class Airplane extends Vehicle {

    public Airplane(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}