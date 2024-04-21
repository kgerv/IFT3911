package reservation_system;

import reservation_system.travel_entities.TravelEntity;
import reservation_system.visitor.Visitor;

public class Reservation extends TravelEntity {

	protected int num;
	protected boolean isConfirmed;

	@Override
	public void accept(Visitor v) {

	}
}