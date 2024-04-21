package reservation_system.travel_entities;

import java.util.ArrayList;
import java.util.HashMap;

import reservation_system.DBTravelEntities;
import java.util.List;

public class TravelManager implements TravelEntityManager {
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
        List<TravelEntity> travels = new ArrayList<TravelEntity>();
        DBTravelEntities db = new DBTravelEntities();
        HashMap<String,TravelEntity> state = db.getState();

        //récupérer seulement les voyages
        for (String key : state.keySet()) {
            if (state.get(key) instanceof Travel) {
                travels.add(state.get(key));
            }
        }
        return travels;

        
    }
}