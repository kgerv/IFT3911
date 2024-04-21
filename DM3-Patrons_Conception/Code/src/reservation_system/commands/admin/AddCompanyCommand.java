package reservation_system.commands.admin;
import reservation_system.users.controller.admin.*;;

public class AddCompanyCommand extends AdminCommand {
    
    
    public AddCompanyCommand(Admin a) {
        super(a);
    }

    @Override
    public void execute() {
        receiver.addCompany();
    }

    @Override
    public void undo() {

    }
}
