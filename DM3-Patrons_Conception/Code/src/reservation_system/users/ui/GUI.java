package reservation_system.users.ui;

public interface GUI {

    /**
     *
     * @param e
     */
    void listen(Event e);

    void display();

    void cancel();

    void undo();

}