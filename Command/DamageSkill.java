package Command;

public class DamageSkill implements Command{
	
	private Skill skill;
	
	public DamageSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public void castSkill() {
		skill.damageSkill();
	}

}
