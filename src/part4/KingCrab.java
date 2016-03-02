package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	
	public KingCrab() {
		setColor(Color.BLUE);
	}
	
	public void processActors(ArrayList<Actor> actors) {
		for (Actor current : actors) {
			Location currentLoc = current.getLocation();
			Location MoveToLoc = currentLoc.getAdjacentLocation(getLocation().getDirectionToward(currentLoc));
			if (getGrid().isValid(MoveToLoc)) {
				current.moveTo(MoveToLoc);
			} else {
				current.removeSelfFromGrid();
			}
		}
	}
}
