package reservation_system.users.ui.admin;

import java.util.Scanner;

import reservation_system.Subject;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.controller.admin.AdminAirline;
import reservation_system.users.controller.admin.AdminCruiseline;
import reservation_system.users.controller.admin.AdminRailway;
import reservation_system.users.ui.GUI;

public class AdminGUI extends Observer implements GUI {

	private Admin admin;
	private boolean isConnected = false;

	public AdminGUI(Admin admin) {
		this.admin = admin;
	}

	/**
	 * 
	 * @param e
	 */

	@Override
	public void display() {
		admin.getInterest().display();
	}

	public void displayAdmin() {
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
	}

	public void displayManager() {
		if(!isConnected){
			displayAdmin();
		}
		else{
			display();
		}
	}

	private void buttonAirEntities(){
		AdminAirline adminAirline = new AdminAirline();
		admin.setInterest(adminAirline);
		isConnected = true;
	}
	private void buttonCruiseEntities(){
		AdminCruiseline adminCruiseline = new AdminCruiseline();
		admin.setInterest(adminCruiseline);
		isConnected = true;
	}
	private void buttonTrainEntities(){
		AdminRailway adminRailway = new AdminRailway();
		admin.setInterest(adminRailway);
		isConnected = true;
	}

	@Override
	public void update(Subject s) {

	}
}