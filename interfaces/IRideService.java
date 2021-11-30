package interfaces;

import java.util.List;

public interface IRideService {

    public void offerRide(String userName, String source, String destination, String numberOfSeats, String vehicleName, String vehicleNumber);
    public List<IRide> getAvailableRides(String source, String destination);
    public IRide selectRide(String userName, String source, String destination, String numberOfSeats, String selectionMethod);
    
}
