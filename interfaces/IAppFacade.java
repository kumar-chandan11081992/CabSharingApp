package interfaces;

public interface IAppFacade {

    public void addUser(String name, String gender, String age);
    public void addVehicle(String userName, String vehicleName, String vehicleNumber);
    public void offerRide(String userName, String source, String destination, String numberOfSeats, String vehicleName, String vehicleNumber);
    public IRide selectRide(String userName, String source, String destination, String numberOfSeats, String selectionMethod);
}
