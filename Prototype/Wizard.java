package prototype;

public class Wizard extends Character {
    public Wizard() {
        className = "Wizard";
    }

    @Override
    public void fight() {
        System.out.println("Wizard fights.");
    }
}
