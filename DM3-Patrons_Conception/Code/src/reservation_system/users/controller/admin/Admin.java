package reservation_system.users.controller.admin;

import reservation_system.users.controller.Controller;
import reservation_system.travel_entities.*;

import reservation_system.commands.Command;

import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.visitor.AdminVisitor;

import java.util.List;

public class Admin extends Controller {

	private List<Command> commands;
	private AdminInterest interest;
	private TravelEntityFactory factory;
	private AdminVisitor visitor;
	private List<String> args;

	public Admin(AdminGUI g) {
		super(g);
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

	public void addTravel(List<String> args, List<String> facilities) {
		interest.addTravel(args, facilities);
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