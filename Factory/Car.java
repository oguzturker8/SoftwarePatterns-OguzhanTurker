package factorypattern;
public class Car implements Vehicle {
    @Override
    public void produce() {
        System.out.println("Car  produced successfully");
    }
    @Override
    public void calculateCost(String Brand) {
        switch (Brand) {
            case "BMW":
                System.out.println("Producing cost is 1, Brand is "+Brand);
                break;
            case "Toyota":
                System.out.println("Producing cost is 2, Brand is "+Brand);
                break;
            default:
                System.out.println("Define car brand first "+Brand);
        }
    }

}