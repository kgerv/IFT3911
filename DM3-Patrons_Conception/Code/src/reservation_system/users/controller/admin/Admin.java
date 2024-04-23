package reservation_system.users.controller.admin;

import reservation_system.Controller;
import reservation_system.travel_entities.*;
import reservation_system.DBTravelEntities;
import reservation_system.Subject;

import reservation_system.commands.Command;

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

	public void editCompany(List<String> args) {
		interest.editCompany(args);

	}

	public void deleteCompany(List<String> args) {
		interest.deleteCompany(args);
	}

	public void addTravel(List<String> args) {
		interest.addTravel(args);
	}	

	public void editTravel(List<String> args) {
		interest.editTravel(args);
	}

	public void deleteTravel(List<String> args) {
		interest.deleteTravel(args);
	}

	public void addFacility(List<String> args) {
		interest.addFacility(args);
	}

	public void editFacility(List<String> args) {
		interest.editFacility(args);
	}

	public void deleteFacility(List<String> args) {
		interest.deleteFacility(args);
	}

	public void assignPriceToSection(List<String> args) {
		interest.assignPriceToSection(args);
	}

	public void displayTravelByOrigin(String origin) {
		interest.displayTravelByOrigin(origin);
	}

	public void displayTravelByDestination(String destination) {
		interest.displayTravelByDestination(destination);

	}

	public void displayTravelByCompany(String company) {
		interest.displayTravelByCompany(company);

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