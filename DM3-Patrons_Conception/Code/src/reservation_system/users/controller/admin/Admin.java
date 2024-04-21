package reservation_system.users.controller.admin;

import reservation_system.Controller;
import reservation_system.commands.Command;
import reservation_system.travel_entities.*;
import reservation_system.DBTravelEntities;
import reservation_system.Subject;
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

	public void addCompany() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the company");
		String name = sc.nextLine();
		args.add(name);
		interest.addCompany(args);
		sc.close();
		
		
	}

	public void editCompany() {
		interest.editCompany(args);
	}

	public void deleteCompany() {
		interest.deleteCompany(args);
	}

	public void addTravel() {
		interest.addTravel(args);
	}

	public void editTravel() {
		interest.editTravel(args);
	}

	public void deleteTravel() {
		interest.deleteTravel(args);
	}

	public void addFacility() {
		interest.addFacility(args);
	}

	public void editFacility() {
		interest.editFacility(args);
	}

	public void deleteFacility() {
		interest.deleteFacility(args);
	}

	public void assignPriceToSection() {
		interest.assignPriceToSection(args);
	}

	public void displayTravelByOrigin() {
		interest.displayTravelByOrigin(args);
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

	public AdminInterest getIntrest() {
		return this.interest;
	}

	/**
	 *
	 * @param f
	 */
	public void setFactory(TravelEntityFactory f) { this.factory = f; }
}