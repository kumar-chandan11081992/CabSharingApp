package models;
import java.io.*;
import java.util.*;

import interfaces.IRide;
import interfaces.IUser;

public class NormalRide implements IRide{
    String driverName;
    String source;
    String detination;
    String vehicle;
    String vehicleNumber;
    int availableSeats;

    List<IUser> listOfPassengers;

    public NormalRide(String driverName, String source, String destination,String vehicle, String vehicleNumber, String numberOfSeats){
        listOfPassengers = new LinkedList<>();
        this.driverName = driverName;
        this.source = source;
        this.detination = destination;
        this.vehicle = vehicle;
        this.availableSeats =  numberOfSeats;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getSource() {
        return this.source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getDetination() {
    	return this.detination;
    }
    public void setDetination(String detination) {
    	this.detination = detination;
    }

    @Override
    public String getVehicle() {
    	return this.vehicle;
    }
    public void setVehicle(String vehicle) {
    	this.vehicle = vehicle;
    }

    @Override
    public int getAvailableSeats() {
    	return this.availableSeats;
    }

    @Override
    public void setAvailableSeats(int availableSeats) {
    	this.availableSeats = availableSeats;
    }
    @Override
    public List<IUser> getListOfPassengers() {
        return this.listOfPassengers;
    }

    @Override
    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }

}
