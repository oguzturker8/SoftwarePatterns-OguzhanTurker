package factorypattern;
public class Plane implements Vehicle {
    @Override
    public void produce() {
        System.out.println("Plane  produced successfully");
    }

    @Override
    public void calculateCost(String Personal) {
        if (Personal.equals("1"))
            System.out.println("Producing cost is 3, Personal");
        else if (Personal.equals("0"))
            System.out.println("Producing cost is 4, Not Personal");
        else System.out.println("Wrong definition");
    }
}
