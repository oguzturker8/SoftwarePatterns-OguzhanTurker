package OpenClosed;

public class Sword implements Weapon{
	
	private int iron;
	private String name;
	
	public Sword(int iron, String name) {
		this.iron = iron;
		this.name = name;
	}
	
	public int getIron() { return iron; }
	public void setIron(int iron) {
		this.iron = iron;
	}
	
	public String getName() {return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getCost() {
		return (iron*2);
	}
	
	@Override
	public void log() {
		System.out.println(name + " cost: " + getCost() +" gold" + " | iron");
	}
	
	@Override
	public void listItems() {
		System.out.println(name);
	}
	

}
