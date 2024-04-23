package reservation_system.users.controller.admin;

import reservation_system.Controller;
import reservation_system.commands.Command;
import reservation_system.travel_entities.*;
import reservation_system.DBTravelEntities;
import reservation_system.Subject;
import reservation_system.users.ui.GUI;
import reservation_system.visitor.Visitor;

import java.util.List;

public class Admin implements Visitor, Controller {

	private List<Command> commands;
	private AdminInterest interest;
	private TravelEntityFactory factory;
	private GUI view;

	public Admin(GUI view, AdminInterest i) {
		this.view = view;
		this.interest = i;

	}

	public void undo() {
		// TODO - implement Admin.undo
		throw new UnsupportedOperationException();
	}

	public void create() {
		// TODO - implement Admin.create
		throw new UnsupportedOperationException();
	}

	public void displayTravel() {
		// TODO - implement Admin.displayTravel
		throw new UnsupportedOperationException();
	}

	public void display() {
		// TODO - implement Admin.display
		throw new UnsupportedOperationException();
	}

	public void addCompany(List<String> args) {
		interest.addCompany(args);
	}

	public void editCompany() {

	}

	public void deleteCompany() {

	}

	public void addTravel() {

	}

	public void editTravel() {

	}

	public void deleteTravel() {

	}

	public void addFacility() {

	}

	public void editFacility() {

	}

	public void deleteFacility() {

	}

	public void assignPriceToSection() {

	}

	public void displayTravelByOrigin() {

	}

	public void displayTravelByDestination() {

	}

	public void displayTravelByCompany() {

	}

	/**
	 *
	 * @param i
	 */
	public void setInterest(AdminInterest i) {
		this.interest = i;
	}

	public AdminInterest getInterest() {
		return this.interest;
	}

	/**
	 *
	 * @param f
	 */
	public void setFactory(TravelEntityFactory f) { this.factory = f; }

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