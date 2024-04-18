package ReservationSystem.Users.Observers.Client;

import ReservationSystem.TravelEntities.Company;
import ReservationSystem.DBTravelEntities;
import ReservationSystem.Reservation;
import ReservationSystem.Subject;
import ReservationSystem.TravelEntities.Facility;
import ReservationSystem.TravelEntities.Section;
import ReservationSystem.TravelEntities.Travel;
import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Users.Observers.Observer;
import ReservationSystem.Visitor.Visitor;

public class Client extends Observer implements Visitor {

	private Reservation currentReservation;

	public void searchAvailable() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client.searchAvailable
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void modifyPlace() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client.modifyPlace
		throw new UnsupportedOperationException();
	}

	public void pay() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client.pay
		throw new UnsupportedOperationException();
	}

	public void addPassengerInfo() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client.addPassengerInfo
		throw new UnsupportedOperationException();
	}

	@Override
	public void update(Subject s) {

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
}