package ReservationSystem;

import ReservationSystem.TravelEntities.Place;

public class Reserved implements Availability {

    public Reserved() {}
    
    @Override
    public void updateState(Place context) {
        context.setAvailability(new Rserved());
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