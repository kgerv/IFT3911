package ReservationSystem.TravelEntities.AirTravel;

public class Airline extends Company {

    public Airline(String id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}