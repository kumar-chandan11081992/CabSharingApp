package facade;

import interfaces.IAppFacade;
import interfaces.IDAOService;
import interfaces.IRide;
import interfaces.IRideService;

public class ApplicationFacade implements IAppFacade{

    IDAOService daoService;
    IRideService rideService;

    public ApplicationFacade(IDAOService daoService, IRideService rideService){
        this.daoService = daoService;
        this.rideService = rideService;
    }

    @Override
    public void addUser(String name, String gender, String age) {
        daoService.addUser(name, gender, age);
        return;
    }

    @Override
    public void addVehicle(String userName, String vehicleName, String vehicleNumber) {
        daoService.addVehicle(userName, vehicleName, vehicleNumber);
        
    }

    @Override
    public void offerRide(String userName, String source, String destination, String numberOfSeats, String vehicleName, String vehicleNumber) {
        rideService.offerRide(userName, source, destination, numberOfSeats, vehicleName, vehicleNumber);
        return;
    }

    @Override
    public IRide selectRide(String userName, String source, String destination, String numberOfSeats, String selectionMethod) {
        return rideService.selectRide(userName, source, destination, numberOfSeats, selectionMethod);
    }
}
