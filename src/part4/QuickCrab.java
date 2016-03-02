package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			Location moveLoc = neighborLoc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc) && gr.isValid(moveLoc) && gr.get(neighborLoc) == null && gr.get(moveLoc) == null)
				locs.add(moveLoc);
		}
		if(locs.size() == 0)
			return super.getLocationsInDirections(directions);
		else
			return locs;
	}

}
