package by.jwd.pravdivets.task6.karlssonairlines.logic;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.CargoAircraft;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;

public class CargoLoader {

	public final int LUGGAGE_WEIGHT_BUSINESS = 32; //по данным Белавиа
	public final int LUGGAGE_WEIGHT_ECONOMY = 23; //по данным Белавиа

	
	public Passenger[] makePassengersPool(int businessNumber, int economyNumber, 
			double businessPrice, double economyPrice) {
		
		int totalPassengers = businessNumber + economyNumber;
		
		Passenger[] pool = new Passenger[totalPassengers];

		for(int i = 1; i <= totalPassengers; i++) {
			Passenger passenger;
			
			if (i <= businessNumber) {
				passenger = new Passenger(i, businessPrice, true);
				passenger.setWeight(passenger.getWeight() + LUGGAGE_WEIGHT_BUSINESS);
			} else {
				passenger = new Passenger(i, economyPrice, false);
				passenger.setWeight(passenger.getWeight() + LUGGAGE_WEIGHT_ECONOMY);
			}
			
			pool[i-1] = passenger;
			
		}
		
		return pool;
	}

	
	
	public void loadPassangers(Airliner airliner, Passenger[] pool) throws NullPlaneException, NullCargoException, CargoOverloadException {
		
		Checks.plainCheck(airliner);
		Checks.passengersCheck(pool);
		
		if (pool.length > airliner.getPassengers().length) {
			throw new CargoOverloadException("Too much passengers for this plane");
		}
		
		
		for (int i = 0; i < pool.length; i++) {
			airliner.getPassengers()[i] = pool[i];
		}
	}
	
	
	public void loadShipment(CargoAircraft cargoAircraft, Shipment shipment) throws NullPlaneException, NullCargoException, CargoOverloadException {
		Checks.plainCheck(cargoAircraft);
		Checks.cargoCheck(shipment);
		
		if(shipment.getWeight() > cargoAircraft.getMaxLoad()) {
			throw new CargoOverloadException("The shipment is too heavy for this plane.");
		}
		
		cargoAircraft.setShipment(shipment);
	}
	
	
	
}
