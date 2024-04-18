package ReservationSystem.TravelEntities;

import ReservationSystem.Visitor.Visitor;

public abstract class Direct extends Travel {

    protected Facility origin;
    protected Facility destination;

    public abstract void accept(Visitor v);
}
