package by.jwd.pravdivets.task6.karlssonairlines.logic.comparator;

import java.util.Comparator;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;

public class SpeedComparator implements Comparator<Plane> {

	@Override
	public int compare(Plane o1, Plane o2) {
		return o1.getCruiseSpeed() - o2.getCruiseSpeed();
	}

}
