package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		
		for (Actor currentActor : actors) {
			if (currentActor instanceof Rock) {
				currentActor.removeSelfFromGrid();
			}
		}
	}
	
}
