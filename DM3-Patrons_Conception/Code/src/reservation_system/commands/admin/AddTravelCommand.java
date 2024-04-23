package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class AddTravelCommand extends AdminCommand {
    private List<String> facilities;

    public AddTravelCommand(List<String> args, List<String> facilities, Admin admin) {
        super(args, admin);
        this.facilities = facilities;
    }

    @Override
    public void execute() { this.admin.addTravel(args, facilities); }

    @Override
    public void undo() { this.admin.deleteTravel(args); }
}
