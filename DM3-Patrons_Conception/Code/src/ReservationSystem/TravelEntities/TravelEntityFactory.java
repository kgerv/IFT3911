package ReservationSystem.TravelEntities;

import java.util.Calendar;
import java.util.List;

public abstract class TravelEntityFactory {

	public abstract Travel createTravel(String id, Calendar dep, Calendar arv, float fullPrice, List<Facility> facilities, Vehicle vehicle);

	public abstract Facility createFacility(String id, String name, String city, String country);

	public abstract Company createCompany(String id);

	public abstract Section createSection();
}