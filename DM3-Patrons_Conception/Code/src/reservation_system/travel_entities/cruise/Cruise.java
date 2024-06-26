package reservation_system.travel_entities.cruise;

import reservation_system.travel_entities.Facility;
import reservation_system.travel_entities.MultiStops;
import reservation_system.visitor.Visitor;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class Cruise extends MultiStops {

    public Cruise(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> ports, Cruiseship ship) {
        this.id = id;
        this.departureDate = dep;
        this.arrivalDate = arv;
        this.duration = Duration.between(dep.toInstant(), arv.toInstant());
        this.fullPrice = fullPrice;
        this.stops = ports;
        this.vehicle = ship;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}