package Command;

public class Skill {
	
	private String[] skills;
	private int mana;
	
	public Skill(String[] skills, int mana) {
		this.skills = skills;
		this.mana = mana;
	}

	
	
	public void damageSkill() {
		if( mana >= 300 ) {
			System.out.println("Damage - "+skills[0]+", 300 mana.");
		}else System.out.println("Not enough mana for "+skills[0]+" ("+mana+"/300).");
		
	}
	
	public void healSkill() {
		if( mana >= 250 ) {
			System.out.println("Heal - "+skills[1]+", 250 mana.");
		}else System.out.println("Not enough mana for "+skills[1]+" ("+mana+"/250).");
	}
	
	public void armorSkill() {
		if( mana >= 150 ) {
			System.out.println("Armor - "+skills[2]+", 150 mana.");
		}else System.out.println("Not enough mana for "+skills[2]+" ("+mana+"/150).");
	}

}
