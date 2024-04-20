package reservation_system.travel_entities;

import reservation_system.travel_entities.cruise.Cruise;
import reservation_system.travel_entities.cruise.CruiseLine;
import reservation_system.travel_entities.cruise.Cruiseship;
import reservation_system.travel_entities.cruise.Port;

import java.util.Calendar;
import java.util.List;

public class CruiseTravelFactory extends TravelEntityFactory {

    private static CruiseTravelFactory instance;

    private CruiseTravelFactory() {}

    @Override
    public Travel createTravel(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> facilities, Vehicle vehicle) {
        return new Cruise(id, dep, arv, fullPrice, facilities, (Cruiseship) vehicle);
    }

    @Override
    public Facility createFacility(String id, String name, String city, String country) {
        return new Port(id, name, city, country);
    }

    @Override
    public Company createCompany(String id) {
        return new CruiseLine(id);
    }

    @Override
    public Section createSection() {
        return new CabinSection();
    }

    public static CruiseTravelFactory getInstance() {
        if(instance == null)  instance = new CruiseTravelFactory();

        return instance;
    }
}