package reservation_system.users.ui;

import reservation_system.commands.Command;

public class Button {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }


}
