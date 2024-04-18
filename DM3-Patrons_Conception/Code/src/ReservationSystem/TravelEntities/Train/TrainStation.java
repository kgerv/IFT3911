package ReservationSystem.TravelEntities.Train;

import ReservationSystem.TravelEntities.Facility;
import ReservationSystem.Visitor.Visitor;

public class TrainStation extends Facility {
    public TrainStation(String id, String name, String city, String country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}