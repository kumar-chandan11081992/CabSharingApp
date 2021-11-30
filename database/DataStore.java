package database;

import java.util.HashMap;

import javax.xml.crypto.Data;

import interfaces.IUser;
import interfaces.IVehicle;

public class DataStore {
    private static DataStore database;
    private HashMap<Integer, IUser> users;
    private HashMap<Integer, IVehicle> vehicles;
    private int userId;
    private int vehicleId;
    private DataStore(){
    }

    public void addUser(IUser user){
        users.put(userId, user);
        this.userId++;
    }

    public void addVehicle(IVehicle vehicle){
        vehicles.put(vehicleId, vehicle);
        this.vehicleId++;
    }

    public static DataStore getInstance()
    {
        if(database == null)
            database = new DataStore();
        
        return database;
    }
}
