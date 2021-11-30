package interfaces;

import models.Passenger;

public interface ICabObservable {

    public void subscribe(IUser user);

    public void remove(IUser user);

    public void addToActiveRides(String vehicle, Passenger passenger);

    public void notifyUser();

    public void addRide(IRide ride);
}
