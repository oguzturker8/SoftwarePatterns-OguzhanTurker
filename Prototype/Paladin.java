package prototype;

public class Paladin extends Character {
    public Paladin() {
        className = "Paladin";
    }

    @Override
    public void fight() {
        System.out.println("Paladin fights.");
    }
}
