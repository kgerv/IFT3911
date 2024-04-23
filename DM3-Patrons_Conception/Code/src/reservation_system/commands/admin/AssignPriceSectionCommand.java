package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.ArrayList;
import java.util.List;

public class AssignPriceSectionCommand extends AdminCommand {

    public AssignPriceSectionCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.assignPriceToSection(args);
    }

    @Override
    public void undo() {
        this.args.set(1, "NaN");
        this.admin.assignPriceToSection(args);
    }
}
