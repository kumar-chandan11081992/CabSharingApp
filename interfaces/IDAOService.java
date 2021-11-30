package interfaces;

import java.util.List;

public interface IDAOService {
    
    public IUser addUser(String name, String gender, String age);
    public IVehicle addVehicle(String userName, String vehicleName, String vehicleNumber);
}
