package reservation_system;

import reservation_system.travel_entities.Place;

public class Available implements Availability {

    public Available() {}

    @Override
    public void updateState(Place context) {
        context.setAvailability(new Available());
    }

    @Override
    public void previousState(Place context) {
        context.setAvailability(new Available());
    }

    @Override
    public void nextState(Place context) {
        context.setAvailability(new Reserved());
    }
}