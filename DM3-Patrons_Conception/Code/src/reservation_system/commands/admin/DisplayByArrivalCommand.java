package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DisplayByArrivalCommand extends AdminCommand {
    public DisplayByArrivalCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.displayTravelByDestination(args);
    }

    @Override
    public void undo() {} // Can't be undone
}
