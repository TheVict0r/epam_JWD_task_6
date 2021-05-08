package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://ru.wikipedia.org/wiki/Ан-124
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.CargoAircraft;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;

@SuppressWarnings("serial")
public class An124 extends CargoAircraft implements Serializable {

	public An124() {
		
	}

	public An124(int id, int manufactYear, int fuelConsumption,
			Shipment[] shipment) {
		super(id, manufactYear, 120_000, 5400, 825, 12600, shipment);
		
	}

	
	
	
}