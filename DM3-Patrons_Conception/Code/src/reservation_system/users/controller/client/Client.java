package reservation_system.users.controller.client;

import reservation_system.Controller;
import reservation_system.travel_entities.Company;
import reservation_system.DBTravelEntities;
import reservation_system.Reservation;
import reservation_system.travel_entities.Facility;
import reservation_system.travel_entities.Section;
import reservation_system.travel_entities.Travel;
import reservation_system.travel_entities.Vehicle;
import reservation_system.users.ui.client.ClientGUI;
import reservation_system.visitor.Visitor;

public class Client implements Visitor, Controller {

	private Reservation currentReservation;
	private ClientGUI view;
	//private ClientInterest interest;

	public void searchAvailable() {
		// TODO - implement Client.searchAvailable
		throw new UnsupportedOperationException();
	}

	public void reservePlace() {
		// TODO - implement Client.reservePlace
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement Client.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void modifyPlace() {
		// TODO - implement Client.modifyPlace
		throw new UnsupportedOperationException();
	}

	public void pay() {
		// TODO - implement Client.pay
		throw new UnsupportedOperationException();
	}

	public void addPassengerInfo() {
		// TODO - implement Client.addPassengerInfo
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(DBTravelEntities db) {

	}

	@Override
	public void visit(Travel t) {

	}

	@Override
	public void visit(Facility f) {

	}

	@Override
	public void visit(Company c) {

	}

	@Override
	public void visit(Vehicle v) {

	}

	@Override
	public void visit(Section s) {

	}

	@Override
	public void displayTravelByOrigin() {

	}
}