package reservation_system;

import reservation_system.commands.Command;
import reservation_system.commands.admin.AddCompanyCommand;
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
		GUI view = null;
		Controller controller;
		String choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("----------------------------");
			System.out.println("1. Admin\n2. Client\n0. Exit");
			System.out.println("----------------------------");
			choice = sc.nextLine();

			switch (choice) {
				case "0":
					System.exit(0);
				case "1":
					// mimic login process
					for(int i = 0; i < 2; ++i) {
						System.out.print("username: ");
						String user = sc.nextLine();
						System.out.print("\npassword: ");
						String pass = sc.nextLine();

						if (user.compareTo("admin") == 0 && pass.compareTo("admin") == 0) {
							view = new AdminGUI(null);
							break;
						} else {
							System.out.println("Invalid username or password");
						}
					}

					break;
				case "2":
					view = new ClientGUI(null);

					break;
				default:
					System.out.println("Invalid choice\n");
			}
		} while(!choice.equals("1") && !choice.equals("2"));

		sc.close();
		view.display();
	}

}