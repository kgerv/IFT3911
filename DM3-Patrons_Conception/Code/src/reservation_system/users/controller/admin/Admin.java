package reservation_system.users.controller.admin;

import reservation_system.Controller;
import reservation_system.travel_entities.*;
import reservation_system.DBTravelEntities;
import reservation_system.Subject;

import reservation_system.commands.Command;

import reservation_system.users.ui.GUI;
import reservation_system.visitor.AdminVisitor;
import reservation_system.visitor.Visitor;
import java.util.Scanner;
import java.util.List;

public class Admin {

	private List<Command> commands;
	private AdminInterest interest;
	private TravelEntityFactory factory;
	private AdminVisitor visitor;
	private List<String> args;

	public Admin() {
		
	}

	private void displayTravel() {
		TravelManager manager = new TravelManager();
		//itérateur sur les voyages
		List<TravelEntity> travels = manager.get();

		for(TravelEntity travel : travels){
			System.out.println(travel);
		}

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
}