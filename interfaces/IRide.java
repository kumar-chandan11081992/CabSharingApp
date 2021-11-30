package interfaces;

import java.util.List;

public interface IRide {
    public String getDriverName();
    public String getSource();
    public String getDetination();
    public String getVehicle();
    public int getAvailableSeats();
    public String getVehicleNumber();
    public void setAvailableSeats(int availableSeats);
    public List<IUser> getListOfPassengers();
}
