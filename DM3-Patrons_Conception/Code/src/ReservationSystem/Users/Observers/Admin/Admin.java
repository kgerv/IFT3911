package ReservationSystem.Users.Observers.Admin;

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
import ReservationSystem.Commands.CommandHistory;
import java.util.List;

public class Admin extends Observer implements Visitor {

	private List<Command> commands;
	private CommandHistory history = new CommandHistory();
	//stocker les trajets
	private List<Travel> travels;

	/**
	 * 
	 * @param c
	 */
	public void excuteCommand(Command c) {
		c.execute();
		history.push(c);
	}

	public void undo() {
		history.pop();
	}

	public void setCommand(Command c) {
		commands.add(c);
	}

	public void create() {
		// TODO - implement ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin.create
		throw new UnsupportedOperationException();
	}

	public void displayTravel() {
		
	}

	public void display() {
		
	}

	@Override
	public void update(Subject s) {
		//
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