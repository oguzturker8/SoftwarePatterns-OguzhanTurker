package Command;

public class HealSkill implements Command {

	private Skill skill;
	
	public HealSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public void castSkill() {
		skill.healSkill();
	}
	
}
