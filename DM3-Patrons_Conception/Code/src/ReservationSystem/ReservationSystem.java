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
		GUI view = null;
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("1.ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Admin.Admin\n2.ReservationSystem.ReservationSystem.ReservationSystem.User.UI.ReservationSystem.User.Observer.Client.Client");

		String choice = scan.nextLine();

		switch(choice) {
			case "1":
				view = new AdminGUI();
				break;
			case "2":
				view = new ClientGUI();
				break;
			default:
				System.out.println("Invalid choice");
		}

		if(view != null) {
			view.display();
		}

	}

}