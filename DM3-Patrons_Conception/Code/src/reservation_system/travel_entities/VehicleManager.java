package reservation_system.travel_entities;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import reservation_system.DBTravelEntities;



public class VehicleManager implements TravelEntityManager {
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
    public List<TravelEntity> get () {
        List<TravelEntity> vehicules = new ArrayList<TravelEntity>();
        DBTravelEntities db = new DBTravelEntities();
        HashMap<String,TravelEntity> state = db.getDB();

        //récupérer seulement les voyages
        for (String key : state.keySet()) {
            if (state.get(key) instanceof Vehicle) {
                vehicules.add((Vehicle) state.get(key));
            }
        }
        return vehicules;
        
    }

    
}