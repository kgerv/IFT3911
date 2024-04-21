package reservation_system.users.ui.admin;

import reservation_system.Subject;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.controller.admin.AdminAirline;
import reservation_system.users.controller.admin.AdminCruiseline;
import reservation_system.users.controller.admin.AdminRailway;
import reservation_system.users.ui.GUI;
import reservation_system.commands.admin.*;

import java.util.Scanner;
import reservation_system.users.ui.Button;

public class AdminGUI extends Observer implements GUI {

	private Admin controller;
	private boolean homeMenu = true;


	public AdminGUI(Admin controller) {
		this.controller = controller;
	}

	@Override
	public void display() {
		if(homeMenu){
			displayMenu();
		}else{
			displayMain();
		}
	}

	public void setHomeMenu(boolean homeMenu){
		this.homeMenu = homeMenu;
		display();
	}

	public void displayMain(){
		System.out.println("Welecome "+controller.getIntrest().getClass().getName());
		System.out.println("1. Add Company");
		System.out.println("2. Edit Company");
		System.out.println("3. Delete Company");
		System.out.println("4. Add Travel");
		System.out.println("5. Edit Travel");
		System.out.println("6. Delete Travel");
		System.out.println("7. Add Facility");
		System.out.println("8. Edit Facility");
		System.out.println("9. Delete Facility");
		System.out.println("10. Exit");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		Button button = new Button();
		
		switch(choice) {
			case 1:
				button.setCommand(new AddCompanyCommand(controller));
				button.execute();
				break;
			case 2:
				controller.editCompany();
				break;
			case 3:
				controller.deleteCompany();
				break;
			case 4:
				controller.addTravel();
				break;
			case 5:
				controller.editTravel();
				break;
			case 6:
				controller.deleteTravel();
				break;
			case 7:
				controller.addFacility();
				break;
			case 8:
				controller.editFacility();
				break;
			case 9:
				controller.deleteFacility();
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		scan.close();
	}



	public void displayMenu(){
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Airline Entities");
		System.out.println("2. Cruise Entities");
		System.out.println("3. Train Entities");
		System.out.println("4. Exit");

		int choice = scan.nextInt();

		switch(choice){
			case 1:
				buttonAirEntities();
				break;
			case 2:
				buttonCruiseEntities();
				break;
			case 3:
				buttonTrainEntities();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		scan.close();
	}

	public void displayManager() {
		
	}


	private void buttonAirEntities(){
		AdminAirline adminAirline = new AdminAirline();
		controller.setInterest(adminAirline);
		setHomeMenu(false);
		
	}
	private void buttonCruiseEntities(){
		controller.setInterest(new AdminCruiseline());
		setHomeMenu(false);
	}
	private void buttonTrainEntities(){
		controller.setInterest(new AdminRailway());
		setHomeMenu(false);
	}

	@Override
	public void update(Subject s) {

	}
}