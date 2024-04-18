package ReservationSystem.TravelEntities;

import java.time.Duration;
import java.util.Calendar;

public abstract class Travel extends TravelEntity {

	protected Calendar departureDate;
	protected Calendar arrivalDate;
	protected Duration duration;
	protected float fullPrice;
	protected Vehicle vehicle;

}