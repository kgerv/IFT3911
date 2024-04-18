package ReservationSystem.TravelEntities;

import ReservationSystem.Visitor.Visitor;

public abstract class Facility extends TravelEntity {

	protected String name;
	protected String city;
	protected String country;

	@Override
	public abstract void accept(Visitor v);
}