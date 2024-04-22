package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class EditCompanyCommand extends AdminCommand {
    public EditCompanyCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.editCompany(args);
    }

    @Override
    public void undo() {
        this.admin.editCompany(args);
    }
}
