package reservation_system;

import reservation_system.travel_entities.Place;

public class Assigned implements Availability {
    
    public Assigned() {}

    @Override
    public void updateState(Place context) {
        context.setAvailability(new Assigned());
    }

    @Override
    public void previousState(Place context) {
        context.setAvailability(new Reserved());
    }

    @Override
    public void nextState(Place context) {
        context.setAvailability(new Available());
    }
}