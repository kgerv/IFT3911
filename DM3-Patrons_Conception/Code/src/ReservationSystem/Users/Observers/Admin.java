package ReservationSystem.Users.Observers;

import ReservationSystem.Commands.Command;
import ReservationSystem.TravelEntities.Company;
import ReservationSystem.DBTravelEntities;
import ReservationSystem.Subject;
import ReservationSystem.TravelEntities.Facility;
import ReservationSystem.TravelEntities.Section;
import ReservationSystem.TravelEntities.Travel;
import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Users.Observers.Observer;
import ReservationSystem.Visitor.Visitor;

import java.util.List;

public class Admin extends Observer implements Visitor {

	private List<Command> commands;

	/**
	 * 
	 * @param c
	 */
	public void excuteCommand(Command c) {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.excuteCommand
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.undo
		throw new UnsupportedOperationException();
	}

	public void setCommand() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.setCommand
		throw new UnsupportedOperationException();
	}

	public void create() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.create
		throw new UnsupportedOperationException();
	}

	public void displayTravel() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.displayTravel
		throw new UnsupportedOperationException();
	}

	public void display() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.display
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