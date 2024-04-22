package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class EditFacilityCommand extends AdminCommand {

    public EditFacilityCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.editFacility(args);
    }

    @Override
    public void undo() {
        this.admin.editFacility(args);
    }
}
