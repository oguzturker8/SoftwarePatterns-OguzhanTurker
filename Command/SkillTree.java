package Command;

import java.util.ArrayList;
import java.util.List;

public class SkillTree {

	private List<Command> skillTree = new ArrayList<Command>();
	
	public void addSkill(Command Command) {
		skillTree.add(Command);
	}
	
	
	public void castSkill() {
		
		for( Command order: skillTree) {
			order.castSkill();
		}
		
		skillTree.clear();
	}
	
}
