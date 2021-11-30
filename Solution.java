import java.io.*;
import java.util.*;

import facade.ApplicationFacade;
import interfaces.IAppFacade;
import interfaces.ICabObservable;
import interfaces.IDAOService;
import interfaces.IRideService;
import services.CabObservable;
import services.DAOService;
import services.RideService;
public class Solution
{
    public static void main(String[] args){
        ICabObservable cabObservable = CabObservable.getInstance();
        IRideService rideService = new RideService(cabObservable);
        IDAOService daoService = new DAOService();
        IAppFacade appFacade = new ApplicationFacade(daoService, rideService);
        appFacade.addUser("Rohan", "M", "36");
        appFacade.addVehicle("Rohan", "Swift", "KA-01-12345");
        appFacade.addUser("Shashank", "M", "29");
        appFacade.addVehicle("Shashank", "Baleno", "TS-05-62395");
        appFacade.addUser("Nandini", "F", "29");
        appFacade.addUser("Shipra", "F", "27");
        appFacade.addVehicle("Shashank", "Baleno", "TS-05-62395");
        appFacade.addUser("Gaurav", "M", "29");
        appFacade.addUser("Rahul", "M", "35");
        appFacade.addVehicle("Shashank", "Baleno", "TS-05-62395");
        appFacade.offerRide("Rohan", "Hyderabad", "Bangalore", "1", "Swift", "KA-01-12345");
    }
}