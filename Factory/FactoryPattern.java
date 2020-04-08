package factorypattern;
    public class FactoryPattern {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
    
        Vehicle vehicle1 = vehicleFactory.getVehicle("Car");
        vehicle1.produce();
        vehicle1.calculateCost("BMW");
        

        Vehicle vehicle2 = vehicleFactory.getVehicle("Plane");
        vehicle2.produce();
        vehicle2.calculateCost("0");
        
        Vehicle vehicle3 = vehicleFactory.getVehicle("Ship");
        vehicle3.produce();
        vehicle3.calculateCost("6");

    }
    }