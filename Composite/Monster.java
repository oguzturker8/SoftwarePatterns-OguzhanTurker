package Composite;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Character {
	
	private List<Character> monsterList = new ArrayList<Character>();
	
	@Override
	public void getCharacter() {
		for( Character character:monsterList ) {
			character.getCharacter();
		}
	}
	
	public void addCharacter(Character newChar) {
		monsterList.add(newChar);
	}

	
	public void removeCharacter(Character deleteChar) {
		monsterList.remove(deleteChar);
	}
}
