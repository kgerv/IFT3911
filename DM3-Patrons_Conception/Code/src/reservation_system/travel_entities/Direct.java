package reservation_system.travel_entities;

import reservation_system.visitor.Visitor;

public abstract class Direct extends Travel {

    protected Facility origin;
    protected Facility destination;

    public abstract void accept(Visitor v);
}
