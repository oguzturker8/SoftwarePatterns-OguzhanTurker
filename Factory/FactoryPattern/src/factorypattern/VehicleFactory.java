package factorypattern;
public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null)
            return null;
        else if (vehicleType.equals("Car"))
            return new Car();
        else if (vehicleType.equals("Plane"))
            return new Plane();
        else if (vehicleType.equals("Ship"))
            return new Ship();
        return null;
    }
}


