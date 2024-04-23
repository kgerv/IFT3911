package reservation_system.users.ui.admin;

import reservation_system.Subject;
import reservation_system.commands.Invoker;
import reservation_system.commands.admin.*;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.ui.GUI;

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
			System.out.println("[1] Add Company");
			System.out.println("[2] Edit Company");
			System.out.println("[3] Delete Company");
			System.out.println("[4] Add Travel");
			System.out.println("[5] Edit Travel");
			System.out.println("[6] Delete Travel");
			System.out.println("[7] Add Facility");
			System.out.println("[8] Edit Facility");
			System.out.println("[9] Delete Facility");
			System.out.println("[10] Display " + this.keywords[3] + " by origin");
			System.out.println("[11] Display " + this.keywords[3] + " by destination");
			System.out.println("[12] Display " + this.keywords[3] + " by company");
			System.out.println("[13] Assign price to section");
			System.out.println("[0] Exit");
			System.out.println("----------------------------");

			choice = sc.nextInt();
			List<String> args = new ArrayList<>();


			switch (choice) {
				case 1:
					System.out.println("company infos");
					button.setCommand(new AddCompanyCommand(args, controller));

					break;
				case 2:
					System.out.println();
					button.setCommand(new EditCompanyCommand(args, controller));

					break;
				case 3:
					System.out.println();
					button.setCommand(new DeleteCompanyCommand(args, controller));

					break;
				case 4:
					System.out.println();
					button.setCommand(new AddFacilityCommand(args, controller));

					break;
				case 5:
					System.out.println();
					button.setCommand(new EditFacilityCommand(args, controller));

					break;
				case 6:
					System.out.println();
					button.setCommand(new DeleteFacilityCommand(args, controller));

					break;
				case 7:
					System.out.println();
					button.setCommand(new AddTravelCommand(args, controller));

					break;
				case 8:
					System.out.println();
					button.setCommand(new EditTravelCommand(args, controller));

					break;
				case 9:
					System.out.println();
					button.setCommand(new DeleteTravelCommand(args, controller));

					break;
				case 10:
					System.out.println();
					button.setCommand(new DisplayByOriginCommand(args, controller));

					break;
				case 11:
					System.out.println();
					button.setCommand(new DisplayByArrivalCommand(args, controller));

					break;
				case 12:
					System.out.println();
					button.setCommand(new DisplayByCompanyCommand(args, controller));

					break;
				case 13:
					System.out.println();
					button.setCommand(new AssignPriceSectionCommand(args, controller));

					break;
				default:
					System.out.println("Invalid choice");
			}
		} while(choice < 0 || choice > 13);

		sc.close();
		button.execute();
	}

	@Override
	public void cancel() {}

	@Override
	public void undo() { } // Nothing to undo

	public void stateManager(AdminGUIState s) {
		this.state = s;
	}


/* start request to user
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
	
	*/

	@Override
	public void update(Subject s) {

	}
}