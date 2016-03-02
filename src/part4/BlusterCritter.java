package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter {
	
	public int c = 2;
	public int col;
	public int row;
	public int length = 5;
	
	public ArrayList<Actor> getActors() {
		col = getLocation().getCol() - 2;
		row = getLocation().getRow() - 2;
		ArrayList<Actor> actors = new ArrayList<Actor>();
		for (int n = col; n < col + length; n ++) {
			for (int i = row; i < row + length; i++) {
				if (getGrid().isValid(new Location(n,i))) {
					Actor a = getGrid().get(new Location(n,i));
					if (a != null && a instanceof Critter) {
						actors.add(a);
					}
				}
			}
		}
		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
		if (actors.size() < c) {
			setColor(getColor().darker());
		} else {
			setColor(getColor().brighter());
		}
	}
	
}
