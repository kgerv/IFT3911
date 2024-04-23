package reservation_system.travel_entities;

import java.util.List;
import reservation_system.travel_entities.*;
import java.util.ArrayList;
import java.util.HashMap;
import reservation_system.DBTravelEntities;

public class FacilityManager implements TravelEntityManager {
    
    @Override
    public void add(TravelEntity e) {

    }

    @Override
    public void edit(TravelEntity e) {

    }

    @Override
    public void delete(TravelEntity e) {

    }

    @Override
    public List<TravelEntity> get() {
        List<TravelEntity> facilities = new ArrayList<TravelEntity>();
        DBTravelEntities db = new DBTravelEntities();
        HashMap<String,TravelEntity> state = db.getDB();
        
        //récupérer les facilities
        for (String key : state.keySet()) {
            if (state.get(key) instanceof Facility) {
                facilities.add(state.get(key));
            }
        }
        return facilities;

    }

}