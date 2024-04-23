package reservation_system.users.ui.admin;

import reservation_system.commands.Invoker;
import reservation_system.commands.admin.AdminAirlineCommand;
import reservation_system.commands.admin.AdminCruiselineCommand;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.controller.admin.AdminAirline;
import reservation_system.users.ui.GUI;

import java.util.Scanner;

public class AdminGUIMain implements AdminGUIState {
    private AdminGUI view;

    public AdminGUIMain(AdminGUI g) { this.view = g; }

    @Override
    public void display() {
        Invoker airButton = new Invoker();
        Invoker cruiseButton = new Invoker();
        Invoker trainButton = new Invoker();

        airButton.setCommand(new AdminAirlineCommand(this.view));
        cruiseButton.setCommand(new AdminCruiselineCommand(this.view));
        trainButton.setCommand(new AdminRailwayCommand(this.view));

        Scanner sc = new Scanner(System.in);
        String in;

        do {
            System.out.println("[1] Air Travel\n[2] Cruise Travel\n[3] Train Travel\n[0]8/ Exit");
            in = sc.nextLine();
            switch(in) {
                case "1":
                    airButton.execute();
                    break;
                case "2":
                    cruiseButton.execute();
                    break;
                case "3":
                    trainButton.execute();
                    break;
                case "0":
                    cancel();
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        } while(!(in.equals("0") || in.equals("1") || in.equals("2") || in.equals("3")));
    }

    /**
     * Used as exit function
     */
    @Override
    public void cancel() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Close the program?\n\n[Y]es\n[N]o");
        String in = sc.nextLine().toLowerCase();
        sc.close();

        if (in.equals("y")) {
            System.exit(0);
        } else {
            this.display();
        }
    }

    @Override
    public void updateKeywords(AdminGUI g) {

    }
}
