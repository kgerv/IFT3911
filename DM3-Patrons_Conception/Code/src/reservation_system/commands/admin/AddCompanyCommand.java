package reservation_system.commands.admin;

import reservation_system.Controller;
import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class AddCompanyCommand extends AdminCommand {

    public AddCompanyCommand(List<String> args, Admin receiver) {
        super(args, receiver);
    }

    @Override
    public void execute() { this.admin.addCompany(args); }

    @Override
    public void undo() {
        this.admin.deleteCompany(args);
    }
}
