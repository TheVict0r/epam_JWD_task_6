package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;
import java.util.Arrays;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//Обычный пассажирский
@SuppressWarnings("serial")
public abstract class Airliner extends Plane implements Serializable{

	
	private Passenger[] passengers; //массив позволит работать с отдельными пассажирами в случае необходимости
	private int currentPassangersNumber;
	
	public Airliner() { }
	
	public Airliner(int id, int manufactYear, int maxLoad, int flightRange, int cruiseSpeed,
			int fuelConsumption, Passenger[] passengers) {
		super(id, manufactYear, maxLoad, flightRange, cruiseSpeed, fuelConsumption);
		
		this.passengers = passengers;
		}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public int getCurrentPassangersNumber() {
		return currentPassangersNumber;
	}

	public void setCurrentPassangersNumber(int currentPassangersNumber) {
		this.currentPassangersNumber = currentPassangersNumber;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + currentPassangersNumber;
		result = prime * result + Arrays.hashCode(passengers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Airliner other = (Airliner) obj;
		if (currentPassangersNumber != other.currentPassangersNumber)
			return false;
		if (!Arrays.equals(passengers, other.passengers))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		int pasNum = 0; //проверку добавил из-за пустого конструктора, в сигнатуре основного конструктора прописан массив passengers
		if(passengers != null) {
			pasNum = passengers.length;
		}
		
		return super.toString() + ", maximum number of passengers - " + pasNum + 
				", current number of passengers - " + currentPassangersNumber + "]";
	}


	
}
