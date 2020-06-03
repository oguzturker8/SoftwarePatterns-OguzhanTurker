package OpenClosed;

public class Staff implements Weapon {

	private int wood;
	private String name;
	
	public Staff(int wood, String name) {
		this.wood = wood;
		this.name = name;
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
		return (wood*2);
	}
	
	@Override
	public void log() {
		System.out.println(name + " cost: " + getCost() +" gold"  + " | wood("+wood+")");
	}
	
	@Override
	public void listItems() {
		System.out.println(name);
	}
	
}
