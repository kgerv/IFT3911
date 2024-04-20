package reservation_system.travel_entities;

import java.util.List;

public abstract class Vehicle extends TravelEntity {

	protected Company owner;
	protected List<Section> sections;

}