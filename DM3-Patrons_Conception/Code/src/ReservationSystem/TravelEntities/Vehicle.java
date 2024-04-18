package ReservationSystem.TravelEntities;

import java.util.List;

public abstract class Vehicle extends TravelEntity {

	protected Company owner;
	protected List<Section> sections;

}