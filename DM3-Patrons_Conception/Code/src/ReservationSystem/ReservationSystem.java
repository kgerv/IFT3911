package ReservationSystem;

import ReservationSystem.Users.UI.Admin.AdminGUI;
import ReservationSystem.Users.UI.Client.ClientGUI;
import ReservationSystem.Users.UI.GUI;

import java.util.Scanner;

public class ReservationSystem {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SubscriptionManager subManager = new SubscriptionManager();
		GUI view;
		Controller controller;

		DBTravelEntities model = new DBTravelEntities();

		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("1.Admin\n2.Client");

		String choice = scan.nextLine();

		switch(choice) {
			case "1":
				view = new AdminGUI();
				controller = new Admin(view);
				break;
			case "2":
				view = new ClientGUI();
				controller = new Client(view);
				break;
			default:
				System.out.println("Invalid choice");
		}

		if(view != null) {
			view.display();
		}

	}

}