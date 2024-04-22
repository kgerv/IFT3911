package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DeleteFacilityCommand extends AdminCommand {
    public DeleteFacilityCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.deleteFacility(args);
    }

    @Override
    public void undo() {
        this.admin.addFacility(args);
    }
}
