package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class AddTravelCommand extends AdminCommand {
    public AddTravelCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() { this.admin.addTravel(args); }

    @Override
    public void undo() { this.admin.deleteTravel(args); }
}
