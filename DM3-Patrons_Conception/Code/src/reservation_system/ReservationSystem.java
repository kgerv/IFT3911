package reservation_system;

import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.client.ClientGUI;
import reservation_system.users.ui.GUI;

import java.util.Scanner;

public class ReservationSystem {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SubscriptionManager subManager = new SubscriptionManager();
		GUI view = null;
		Controller controller;

		DBTravelEntities model = new DBTravelEntities();

		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("1. Admin\n2. Client\n0. Exit");

		String choice = scan.nextLine();

		switch(choice) {
			case "0":
				System.exit(0);
			case "1":
				view = new AdminGUI(null);
				break;
			case "2":
				view = new ClientGUI(null);
				break;
			default:
				System.out.println("Invalid choice");
		}

		view.display();

	}

}