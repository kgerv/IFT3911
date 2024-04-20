package reservation_system;

import reservation_system.travel_entities.Place;

public class Reserved implements Availability {

    public Reserved() {}
    
    @Override
    public void updateState(Place context) {
        context.setAvailability(new Reserved());
    }

    @Override
    public void previousState(Place context) {
        context.setAvailability(new Available());
    }

    @Override
    public void nextState(Place context) {
        context.setAvailability(new Assigned());
    }
}