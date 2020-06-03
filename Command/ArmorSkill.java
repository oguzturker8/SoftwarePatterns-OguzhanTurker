package Command;

public class ArmorSkill implements Command{

	private Skill skill;
	
	public ArmorSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public void castSkill() {
		skill.armorSkill();
	}
	
}
