package reservation_system.travel_entities.air_travel;

import reservation_system.travel_entities.Direct;
import reservation_system.travel_entities.Facility;
import reservation_system.visitor.Visitor;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class Flight extends Direct {

    public Flight(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> airports, Airplane plane) {
        this.id = id;
        this.departureDate = dep;
        this.arrivalDate = arv;
        this.duration = Duration.between(dep.toInstant(), arv.toInstant());
        this.fullPrice = fullPrice;
        this.origin = airports.get(0);
        this.destination = airports.get(1);
        this.vehicle = plane;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}