package services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import interfaces.ICabObservable;
import interfaces.IRide;
import interfaces.IUser;
import models.Passenger;

public class CabObservable implements ICabObservable{

    private static CabObservable observable;
    private HashMap<String, IRide> activeRides;
    private List<IUser> usersToNotify;
    private List<IRide> availableRides;
    private CabObservable(){
        this.activeRides = new HashMap<>();
        this.usersToNotify = new LinkedList<>();
        this.availableRides = new LinkedList<>();
    }

    @Override
    public void subscribe(IUser user)
    {
        this.usersToNotify.add(user);
    }

    @Override
    public void remove(IUser user)
    {
        this.usersToNotify.remove(user);
    }

    @Override
    public void addRide(IRide ride)
    {
        this.availableRides.add(ride);
    }

    @Override
    public void addToActiveRides(String vehicle, Passenger passenger)
    {
        CabObservable instance = getInstance();
        IRide rideAlreadyInProgress = activeRides.get(vehicle);
        rideAlreadyInProgress.setAvailableSeats(rideAlreadyInProgress.getAvailableSeats() - passenger.getNumberOfSeatsRequested());
        activeRides.put(vehicle, rideAlreadyInProgress);
        
       this.notify();
        
    }

    @Override
    public void notifyUser()
    {
        for(IUser user : this.usersToNotify)
            user.update();
        return;
    }


    public static CabObservable getInstance(){
        if(observable == null)
            observable = new CabObservable();

        return observable;
    }
}
