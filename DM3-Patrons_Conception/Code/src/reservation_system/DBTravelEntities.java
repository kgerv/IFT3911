package reservation_system;

import reservation_system.travel_entities.TravelEntity;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscription;

public class DBTravelEntities extends Subject {
	private HashMap<String, TravelEntity> db;

	public DBTravelEntities() {
		db = new HashMap<>();
		try {
			File save = new File("path/db.txt");
			FileInputStream fis = new FileInputStream(save);
			ObjectInputStream ois = new ObjectInputStream(fis);
			db = (HashMap<String, TravelEntity>) ois.readObject();
			ois.close();
		} catch(IOException | ClassNotFoundException e) {
			System.out.println("Error while loading database content");
			e.printStackTrace();
		}
	}

	public HashMap<String, TravelEntity> getDB() {
		return db;
	}

	/**
	 * 
	 * @param map
	 */
	public void setDB(HashMap<String, TravelEntity> map) {
		db = map;
		SubscriptionManager man = new SubscriptionManager();
		man.getInstance().notify();
	}
}