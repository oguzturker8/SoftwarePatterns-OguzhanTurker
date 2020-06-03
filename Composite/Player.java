package Composite;

import java.util.ArrayList;
import java.util.List;

public class Player implements Character {
	
	private List<Character> playerList = new ArrayList<Character>();
	
	@Override
	public void getCharacter() {
		for( Character character:playerList ) {
			character.getCharacter();
			
		}
	}
	
	public void addCharacter(Character newChar) {
		playerList.add(newChar);
	}

	
	public void removeCharacter(Character deleteChar) {
		playerList.remove(deleteChar);
	}
}
