package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://ru.wikipedia.org/wiki/Ан-124
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;

@SuppressWarnings("serial")
public class An124 extends CargoAircraft implements Serializable {

	public An124() { }

	
	/*в конструкторе ниже используются объективные характеристики данной модели самолета, 
	они в любом случае должны оставаться неизменными. Однако в крайнем случае их можно изменить через сеттеры
	Из слоя DAO получаем реально индивидуальные характеристики для каждого конкретного экземпляра самолёта:
	ID, год производства. Кроме того загружаем из DAO параметры груза для конкретного рейса */
	private final static int MAX_LOAD  = 120_000;
	private final static int FLIGHT_RANGE = 5400; 
	private final static int CRUISE_SPEED = 825;
	private final static int FUEL_CONSUMPTION = 12_600; 

	
	public An124(int id, int manufactYear) {
		super(id, manufactYear, MAX_LOAD, FLIGHT_RANGE, CRUISE_SPEED, FUEL_CONSUMPTION);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		return true;
	}

	
	@Override
	public int hashCode() {
		return super.hashCode();
	}


	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
