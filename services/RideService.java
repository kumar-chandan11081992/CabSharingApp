package services;

import java.text.Normalizer;
import java.util.List;

import interfaces.ICabObservable;
import interfaces.IRide;
import interfaces.IRideService;
import models.NormalRide;

public class RideService implements IRideService{

    ICabObservable cabObservable;

    public RideService(ICabObservable cabObservable){
        this.cabObservable = cabObservable;
    }

    @Override
    public void offerRide(String userName, String source, String destination, String numberOfSeats, String vehicleName, String vehicleNumber) {
        IRide ride = new NormalRide(userName, source, destination,vehicleName, vehicleNumber, numberOfSeats);
        cabObservable.addRide(ride);
    }

    @Override
    public List<IRide> getAvailableRides(String source, String destination) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IRide selectRide(String userName, String source, String destination, String numberOfSeats, String selectionMethod) {
        // TODO Auto-generated method stub
        return null;
    }
}
