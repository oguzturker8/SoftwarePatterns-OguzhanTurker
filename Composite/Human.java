package Composite;

import java.util.ArrayList;
import java.util.List;

import OpenClosed.Weapon;

public class Human implements Character {
	
	private String name;
	private double exp;
	private int level;
	private String raceTalent;
	private List<Weapon> items = new ArrayList<Weapon>();
	private String skills[];
	private int mana;




	
	public Human(String name, double exp, int level, List<Weapon> items, int mana) {
		
		this.name = name;
		this.exp = exp;
		this.level = level;
		raceTalent = "Humans gain +30 defence";
		this.items = items;
		this.mana = mana;
		
	}
	
	@Override
	public void getCharacter() {
		System.out.println("\nHuman"+"\nName: " +name +"\nExp: "+exp+"\nLevel : "+level+"\nMana : "+mana+"\nRace Talent: "+raceTalent);
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
