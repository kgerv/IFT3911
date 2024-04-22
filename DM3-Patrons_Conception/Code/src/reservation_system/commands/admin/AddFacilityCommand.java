package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class AddFacilityCommand extends AdminCommand {

    public AddFacilityCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() { this.admin.addFacility(args); }

    @Override
    public void undo() { this.admin.deleteFacility(args); }
}
