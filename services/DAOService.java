package services;

import javax.print.CancelablePrintJob;

import interfaces.ICabObservable;
import interfaces.IDAOService;
import interfaces.IUser;
import interfaces.IVehicle;

public class DAOService implements IDAOService{

    ICabObservable cabObservable;

    public DAOService(ICabObservable cabObservable){
        this.cabObservable = cabObservable;
    }

    @Override
    public IUser addUser(String name, String gender, String age) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IVehicle addVehicle(String userName, String vehicleName, String vehicleNumber) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
