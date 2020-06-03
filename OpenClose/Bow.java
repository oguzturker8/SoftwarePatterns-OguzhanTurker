package OpenClosed;

public class Bow implements Weapon{
	
	private int iron;
	private int wood;
	private String name;
	
	public Bow(int iron, int wood, String name) {
		this.iron= iron;
		this.wood = wood;
		this.name = name;
	}
	
	public int getIron() { return iron; }
	public void setIron(int iron) {
		this.iron = iron;
	}
	public int getWood() { return wood; }
	public void setWood(int wood) {
		this.wood = wood;
	}
	
	public String getName() {return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getCost() {
		return (iron + wood);
	}
	
	@Override
	public void log() {
		System.out.println(name + " cost: " + getCost() +" gold"+ " | iron("+iron+") wood("+wood+")");
	}
	
	@Override
	public void listItems() {
		System.out.println(name);
	}
	

}
