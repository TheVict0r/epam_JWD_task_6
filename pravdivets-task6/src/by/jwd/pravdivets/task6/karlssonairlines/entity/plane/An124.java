package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://ru.wikipedia.org/wiki/Ан-124
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;

@SuppressWarnings("serial")
public class An124 extends CargoAircraft implements Serializable {

	public An124() { }

	
	/*в конструкторе ниже используются объективные характеристики данной модели самолета, 
	они в любом случае остаются неизменными*/
	public An124(int id, int manufactYear) {
		super(id, manufactYear, 120_000, 5400, 825, 12_600);
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
