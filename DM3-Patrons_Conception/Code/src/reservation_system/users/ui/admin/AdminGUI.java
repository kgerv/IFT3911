package reservation_system.users.ui.admin;

import reservation_system.Subject;
import reservation_system.commands.Invoker;
import reservation_system.commands.admin.*;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.ui.GUI;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminGUI extends Observer implements GUI {
	private AdminGUIState state;
	private Admin controller;
	protected String[] keywords;

	public AdminGUI() {
		this.state = new AdminGUIMain(this);
		this.controller = new Admin(this);
	}

	@Override
	public void display() {
		int choice;
		Scanner sc = new Scanner(System.in);
		Invoker button = new Invoker();
		do {
			System.out.println("----------------------------");
			System.out.println(this.keywords[0] + " Manager:");
			System.out.println("----------------------------");
			System.out.println("[1] Add " + this.keywords[0]); // Company
			System.out.println("[2] Edit " + this.keywords[0]);
			System.out.println("[3] Delete " + this.keywords[0]);
			System.out.println("[4] Add " + this.keywords[1]); // Facility
			System.out.println("[5] Edit " + this.keywords[1]);
			System.out.println("[6] Delete " + this.keywords[1]);
			System.out.println("[7] Add " + this.keywords[3]); // Travel
			System.out.println("[8] Edit " + this.keywords[3]);
			System.out.println("[9] Delete " + this.keywords[3]);
			System.out.println("[10] Display " + this.keywords[3].toLowerCase() + " by origin");
			System.out.println("[11] Display " + this.keywords[3].toLowerCase() + " by destination");
			System.out.println("[12] Display " + this.keywords[3].toLowerCase() + " by company");
			System.out.println("[13] Assign price to section");
			System.out.println("[14] Main Menu");
			System.out.println("[0] Exit");
			System.out.println("----------------------------");

			choice = sc.nextInt();
			List<String> args = new ArrayList<>();
			List<String> facilities = new ArrayList<>();
			String in;

			switch (choice) {
				case 1:
					System.out.println(this.keywords[0] + " infos");
					System.out.print("ID: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new AddCompanyCommand(args, controller));

					break;
				case 2:
					System.out.println(this.keywords[0] + " info to edit");
					System.out.print("ID: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new EditCompanyCommand(args, controller));

					break;
				case 3:
					System.out.print(this.keywords[0] + " ID to delete: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DeleteCompanyCommand(args, controller));

					break;
				case 4:
					System.out.println(this.keywords[1] + " infos");
					System.out.print(this.keywords[1] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nName: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nCity: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nCountry: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new AddFacilityCommand(args, controller));

					break;
				case 5:
					System.out.println(this.keywords[1] + " infos to edit (Leave blank if no changes)");
					System.out.print(this.keywords[1] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nName: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nCity: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nCountry: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new EditFacilityCommand(args, controller));

					break;
				case 6:
					System.out.print(this.keywords[1] + " ID to delete: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DeleteFacilityCommand(args, controller));

					break;
				case 7:
					System.out.println(this.keywords[3] + " infos");
					System.out.print(this.keywords[3] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nDeparture date: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nArrival date: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nFull price: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nOrigin: ");
					in = sc.nextLine();
					facilities.add(in);
					System.out.print("\nDestination: ");
					in = sc.nextLine();
					facilities.add(in);
					System.out.print("\n" + this.keywords[2] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new AddTravelCommand(args, facilities,controller));

					break;
				case 8:
					System.out.println(this.keywords[3] + " infos to edit (Leave blank if no changes)");
					System.out.print(this.keywords[3] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nDeparture date: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nArrival date: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nFull price: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nOrigin: ");
					in = sc.nextLine();
					facilities.add(in);
					System.out.print("\nDestination: ");
					in = sc.nextLine();
					facilities.add(in);
					System.out.print("\n" + this.keywords[2] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new EditTravelCommand(args, facilities, controller));

					break;
				case 9:
					System.out.print(this.keywords[3] + " ID to delete:");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DeleteTravelCommand(args, controller));

					break;
				case 10:
					System.out.print("Origin: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DisplayByOriginCommand(args, controller));

					break;
				case 11:
					System.out.print("Destination: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DisplayByArrivalCommand(args, controller));

					break;
				case 12:
					System.out.print("Company: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new DisplayByCompanyCommand(args, controller));

					break;
				case 13:
					System.out.println(this.keywords[3] + " section and price");
					System.out.print(this.keywords[3] + " ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nSection ID: ");
					in = sc.nextLine();
					args.add(in);
					System.out.print("\nFull price: ");
					in = sc.nextLine();
					args.add(in);
					button.setCommand(new AssignPriceSectionCommand(args, controller));

					break;
				case 14:
					cancel();

					break;
				case 0:
					sc.close();
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		} while(choice < 0 || choice > 13);

		System.out.println();
		sc.close();
		button.execute();
	}


	@Override
	public void cancel() {
		this.state.cancel();
	}

	@Override
	public void undo() { } // Nothing to undo

	public void stateManager(AdminGUIState s) {
		this.state = s;
	}



	@Override
	public void update(Subject s) {
		// not optimal
		System.out.println("The database was updated. You might want to refresh your search");
	}
}