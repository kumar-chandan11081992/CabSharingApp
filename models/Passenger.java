package models;
import interfaces.ICabObservable;
import interfaces.IUser;

public class Passenger implements IUser{
    int numberOfSeatsRequested;

    ICabObservable cabobservable;
    Passenger(ICabObservable cabObservable){
        this.cabobservable = cabObservable;
    }

    public int getNumberOfSeatsRequested() {
        return this.numberOfSeatsRequested;
    }
    public void setNumberOfSeatsRequested(int numberOfSeatsRequested) {
        this.numberOfSeatsRequested = numberOfSeatsRequested;
    }
    @Override
    public void update() {
        
    }
}
