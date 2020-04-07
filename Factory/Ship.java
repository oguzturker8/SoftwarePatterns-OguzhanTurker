package factorypattern;
public class Ship implements Vehicle {

    @Override
    public void produce() {
        System.out.println("Ship produced successfully");
    }

    @Override
    public void calculateCost(String motorSize) {
        if (Integer.parseInt(motorSize) < 1)
            System.out.println("Producing cost is 5");
        else
            System.out.println("Producing cost is 6");
    }

}
