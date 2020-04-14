package prototype;

public class Rogue extends Character {
    public Rogue() {
        className = "Rogue";
    }

    @Override
    public void fight() {
        System.out.println("Rogue fights.");
    }
}
