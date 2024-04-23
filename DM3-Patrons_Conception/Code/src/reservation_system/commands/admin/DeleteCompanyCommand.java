package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DeleteCompanyCommand extends AdminCommand {

    public DeleteCompanyCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.deleteCompany(args);
    }

    @Override
    public void undo() {
        this.admin.addCompany(args);
    }
}
