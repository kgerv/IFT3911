package reservation_system.users.ui.admin;

import java.util.Scanner;

import reservation_system.Subject;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.controller.admin.AdminAirline;
import reservation_system.users.controller.admin.AdminCruiseline;
import reservation_system.users.controller.admin.AdminRailway;
import reservation_system.users.ui.GUI;
import java.util.List;

public class AdminGUI extends Observer implements GUI {

	private Admin admin;
	private boolean isConnected = false;
	private List<String> args;

	public AdminGUI(Admin admin) {
		this.admin = admin;
	}

	@Override
	public void display() {
		displayManager();
	}

	public void displayMenu() {
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Admin GUI");
		System.out.println("1. Manage Airline Companies");
		System.out.println("2. Manage Cruise Companies");
		System.out.println("3. Manage Train Companies");
		System.out.println("0. Exit");

		String choice = scan.nextLine();

		switch(choice) {
			case "0":
				System.exit(0);
			case "1":
				buttonAirEntities();
				break;
			case "2":
				buttonCruiseEntities();
				break;
			case "3":
				buttonTrainEntities();
				break;
			default:
				System.out.println("Invalid choice");
		}
		scan.close();
	}

	public void displayAdmin(){
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Welcome to"+admin.getInterest().getClass().getName());
		System.out.println("1. Add Company");
		System.out.println("2. Edit Company");
		System.out.println("3. Delete Company");
		System.out.println("4. Add Travel");
		System.out.println("5. Edit Travel");
		System.out.println("6. Delete Travel");
		System.out.println("7. Add Facility");
		System.out.println("8. Edit Facility");
		System.out.println("9. Delete Facility");
		System.out.println("10. Display Travel");
		
		System.out.println("0. Exit");

		String choice = scan.nextLine();

		switch (choice) {	
			case "0":
				System.exit(0);
			case "1":
				System.out.println("Enter company name");
				String name = scan.nextLine();
				args.add(name);
				admin.addCompany(args);

				break;
			case "2":
				System.out.println("Enter company name");
				String name1 = scan.nextLine();
				args.add(name1);
				admin.editCompany(args);

				break;
			case "3":
				System.out.println("Enter company name");
				String name2 = scan.nextLine();
				args.add(name2);
				admin.deleteCompany(args);

				break;
			case "4":
				System.out.println("Enter departure date (yyyy-mm-dd)");
				String depDate = scan.nextLine();
				System.out.println("Enter arrival date (yyyy-mm-dd)");
				String arvDate = scan.nextLine();
				System.out.println("Enter full price");
				String fullPrice = scan.nextLine();
				System.out.println("Enter vehicle ID");
				String vehicleID = scan.nextLine();
				args.add(depDate);
				args.add(arvDate);
				args.add(fullPrice);
				args.add(vehicleID);
				admin.addTravel(args);
				break;
			case "5":
				System.out.println("Enter travel ID");
				String travelID = scan.nextLine();
				args.add(travelID);
				admin.deleteTravel(args);

				break;
			case "6":
				System.out.println("Enter travel ID");
				String travelID1 = scan.nextLine();
				args.add(travelID1);
				admin.deleteTravel(args);
				break;
			case "7":
				System.out.println("Enter facility name");
				String facilityName = scan.nextLine();
				System.out.println("Enter facility city");
				String facilityCity = scan.nextLine();
				System.out.println("Enter facility country");
				String facilityCountry = scan.nextLine();
				args.add(facilityName);
				args.add(facilityCity);
				args.add(facilityCountry);
				admin.addFacility(args);
				break;
			case "8":
				System.out.println("Enter facility name");
				String facilityName1 = scan.nextLine();
				args.add(facilityName1);
				admin.editFacility(args);
				break;
			case "9":
				System.out.println("Enter facility name");
				String facilityName2 = scan.nextLine();
				args.add(facilityName2);
				admin.deleteFacility(args);
				break;
			case "10":
				admin.displayTravel();
				break;
			default:
				System.out.println("Invalid choice");
		}
		scan.close();
		args.clear();
	
	}


	public void displayManager() {
		if(!isConnected){
			displayMenu();
		}
		else{
			displayAdmin();
		}
	}

	private void buttonAirEntities(){
		AdminAirline adminAirline = new AdminAirline();
		admin.setInterest(adminAirline);
		setIsConnected(true);
	}
	private void buttonCruiseEntities(){
		AdminCruiseline adminCruiseline = new AdminCruiseline();
		admin.setInterest(adminCruiseline);
		setIsConnected(true);
	}
	private void buttonTrainEntities(){
		AdminRailway adminRailway = new AdminRailway();
		admin.setInterest(adminRailway);
		setIsConnected(true);
	}

	private void setIsConnected(boolean isConnected){
		this.isConnected = isConnected;
		displayManager();
	}

	@Override
	public void update(Subject s) {

	}

	public Admin getAdmin() {
		return admin;
	}
}