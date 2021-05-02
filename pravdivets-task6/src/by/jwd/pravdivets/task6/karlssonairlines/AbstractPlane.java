package by.jwd.pravdivets.task6.karlssonairlines;

public abstract class AbstractPlane {

	PlaneModel model;
	int manufactYear;
	
	double length;
	double wingSpan; //размах крыла
	double height;
	double maxLandWeight; // максимальный посадочный вес
	double maxCommercialLoad; //макс. коммерческая загрузка
	int flightRange; //дальность полета с макс. загрузкой
	int maxSpeed; //макс. крейсерская скорость
	
	//for passangers
	int seatsEconomy;
	int seatsBusiness;
	
	public abstract void fly();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " - [model=" + model + ", manufactYear=" + manufactYear + "]";
	}
	
	
	/*
	 * Типы самолетов
	 * 
	 * Пассажирский - Airliner
	 * транспортные - Cargo aircraft
	 * Почтовый - Mail plane
	 * 
	 * 
	 */
	
	
}
