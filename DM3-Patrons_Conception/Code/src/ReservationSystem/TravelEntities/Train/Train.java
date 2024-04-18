package ReservationSystem.TravelEntities.Train;

import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Visitor.Visitor;

public class Train extends Vehicle {

    public Train(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}