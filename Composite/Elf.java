package Composite;

import java.util.ArrayList;
import java.util.List;

import OpenClosed.Weapon;

public class Elf implements Character {
	
	private String name;
	private double exp;
	private int level;
	private String raceTalent;
	private List<Weapon> items = new ArrayList<Weapon>();
	private String skills[];
	private int mana;

	
	public Elf(String name, double exp, int level, List<Weapon> items,  int mana) {
		
		this.name = name;
		this.exp = exp;
		this.level = level;
		raceTalent = "Elfs can see through walls";
		this.items = items;
		this.mana = mana;
		
	}
	
	@Override
	public void getCharacter() {
		System.out.println("\nElf"+"\nName: " +name +"\nExp: "+exp+"\nLevel : "+level+"\nMana : "+mana+"\nRace Talent: "+raceTalent);
		if( items.size() != 0){
			System.out.println("Items:");
			 for (Weapon weapon: items) {
				 weapon.listItems();
			 } 
		}else System.out.println("No items.");
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public String[] getSkills() {
		return skills;
	}
	
	public int getMana() {
		return mana;
	}
}
