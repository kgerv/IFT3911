package reservation_system.travel_entities;

import reservation_system.visitor.Visitor;

public abstract class Facility extends TravelEntity {

	protected String name;
	protected String city;
	protected String country;

	@Override
	public abstract void accept(Visitor v);
}