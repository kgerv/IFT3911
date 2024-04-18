package ReservationSystem.TravelEntities.Train;

public class Railway extends Company {
    public Railway(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}