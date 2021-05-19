package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//источник https://www.airlines-inform.ru/commercial-aircraft/boeing-737-500.html
@SuppressWarnings("serial")
public class Boeing737500 extends Airliner  implements Serializable {

	public Boeing737500() {
		
	}

	/*в конструкторе ниже используются объективные характеристики данной модели самолета, 
	они в любом случае должны оставаться неизменными. Однако в крайнем случае их можно изменить через сеттеры
	Из слоя DAO получаем реально индивидуальные характеристики для каждого конкретного экземпляра самолёта:
	ID, год производства. Кроме того загружаем из DAO параметры пассажиров для конкретного рейса */
	private final static int MAX_LOAD  = 14770;
	private final static int FLIGHT_RANGE = 3400; 
	private final static int CRUISE_SPEED = 795;
	private final static int FUEL_CONSUMPTION = 2400; 
	private final static Passenger[] PASSENGERS = new Passenger[132];

	public Boeing737500(int id, int manufactYear) {
		super(id, manufactYear, MAX_LOAD, FLIGHT_RANGE, CRUISE_SPEED, FUEL_CONSUMPTION, PASSENGERS);
		
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
