package ReservationSystem.TravelEntities;

import ReservationSystem.TravelEntities.AirTravel.Airline;
import ReservationSystem.TravelEntities.AirTravel.Airplane;
import ReservationSystem.TravelEntities.AirTravel.Airport;
import ReservationSystem.TravelEntities.AirTravel.Flight;

import java.util.Calendar;
import java.util.List;

public class AirTravelFactory extends TravelEntityFactory {

    private static AirTravelFactory instance;

    private AirTravelFactory() {}


    @Override
    public Travel createTravel(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> facilities, Vehicle vehicle) {
        return new Flight(id, dep, arv, fullPrice, facilities, (Airplane) vehicle);
    }

    @Override
    public Facility createFacility(String id, String name, String city, String country) {
        return new Airport(id, name, city, country);
    }

    @Override
    public Company createCompany(String id) {
        return new Airline(id);
    }

    @Override
    public Section createSection() {
        return new SeatSection();
    }

    public static AirTravelFactory getInstance() {
        if(instance == null) instance = new AirTravelFactory();

        return instance;
    }
}