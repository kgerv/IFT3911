package ReservationSystem.TravelEntities;

import ReservationSystem.TravelEntities.Train.Railway;
import ReservationSystem.TravelEntities.Train.Train;
import ReservationSystem.TravelEntities.Train.TrainRoute;
import ReservationSystem.TravelEntities.Train.TrainStation;

import java.util.Calendar;
import java.util.List;

public class TrainTravelFactory extends TravelEntityFactory {

    private static TrainTravelFactory instance;

    public TrainTravelFactory() {}

    @Override
    public Travel createTravel(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> facilities, Vehicle vehicle) {
        return new TrainRoute(id, dep, arv, fullPrice, facilities, (Train) vehicle);
    }

    @Override
    public Facility createFacility(String id, String name, String city, String country) {
        return new TrainStation(id, name, city, country);
    }

    @Override
    public Company createCompany(String id) {
        return new Railway(id);
    }

    @Override
    public Section createSection() {
        return new SeatSection();
    }

    public static TrainTravelFactory getInstance() {
        if(instance == null) instance =  new TrainTravelFactory();

        return instance;
    }
}