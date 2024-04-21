package reservation_system.users.controller.admin;

import reservation_system.Controller;
import reservation_system.commands.Command;
import reservation_system.travel_entities.*;
import reservation_system.DBTravelEntities;
import reservation_system.Subject;
import reservation_system.users.ui.GUI;
import reservation_system.visitor.Visitor;

import java.util.List;

public class Admin extends Controller {

	private List<Command> commands;
	private AdminInterest interest;
	private TravelEntityFactory factory;
	private GUI view;

	public Admin(GUI g, Visitor v, AdminInterest i) {
		super(g, v);
		this.interest = i;

	}

	private List<String> displayTravel() {
		// TODO - implement Admin.displayTravel
		throw new UnsupportedOperationException();
	}

	public void addCompany() {
		interest.addCompany();
	}

	public void editCompany() {
		interest.editCompany();
	}

	public void deleteCompany() {
		interest.deleteCompany();
	}

	public void addTravel() {
		interest.addTravel();
	}

	public void editTravel() {
		interest.editTravel();
	}

	public void deleteTravel() {
		interest.deleteTravel();
	}

	public void addFacility() {
		interest.addFacility();
	}

	public void editFacility() {
		interest.editFacility();
	}

	public void deleteFacility() {
		interest.deleteFacility();
	}

	public void assignPriceToSection() {
		interest.assignPriceToSection();
	}

	public void displayTravelByOrigin() {
		interest.displayTravelByOrigin();
	}

	public void displayTravelByDestination() {
		interest.displayTravelByDestination();
	}

	public void displayTravelByCompany() {
		interest.displayTravelByCompany();
	}

	/**
	 *
	 * @param i
	 */
	public void setInterest(AdminInterest i) {
		this.interest = i;
	}

	/**
	 *
	 * @param f
	 */
	public void setFactory(TravelEntityFactory f) { this.factory = f; }
}