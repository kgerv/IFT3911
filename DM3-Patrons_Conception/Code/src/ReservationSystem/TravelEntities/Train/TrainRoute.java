package ReservationSystem.TravelEntities.Train;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class TrainRoute extends MultiStops {

    public TrainRoute(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> stations, Train train) {
        this.id = id;
        this.departureDate = dep;
        this.arrivalDate = arv;
        this.duration = Duration.between(dep.toInstant(), arv.toInstant());
        this.fullPrice = fullPrice;
        this.stops = stations;
        this.vehicle = train;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}