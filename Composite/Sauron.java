package Composite;


public class Sauron implements Character{

	
	private String name;
	private String talent;
	private String item;

	
	public Sauron() {
		
		name = "SAURON";
		talent = " ========================(o)";
		item = "The RING";
		
	}
	
	
	@Override
	public void getCharacter() {
		System.out.println("\nName :"+name+"\nItem :" +item+"\nTalent: "+talent+"\nHaahhaha ha :) Isildur!");
	}
	
}
