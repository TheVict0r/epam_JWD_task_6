package by.jwd.pravdivets.task6.karlssonairlines.entity;

import by.jwd.pravdivets.task6.karlssonairlines.PlaneModel;
import by.jwd.pravdivets.task6.karlssonairlines.PlaneType;

public abstract class AbstractPlane {

	PlaneType planeType;
	PlaneModel model;
	int manufactYear;
	
	double length;
	double wingSpan; //размах крыла
	double height;
	
	double maxCommercialLoad; //макс. коммерческая загрузка
	int flightRange; //дальность полета с макс. загрузкой
	int maxSpeed; //макс. крейсерская скорость
	
	//for passangers
	int seatsEconomy;
	int seatsBusiness;
	
	public abstract void fly();

	
	
	public PlaneType getPlaneType() {
		return planeType;
	}

	public double getMaxCommercialLoad() {
		return maxCommercialLoad;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}



	@Override
	public String toString() {
		return getClass().getSimpleName() + "[planeType=" + planeType + ", model=" + model + ", manufactYear=" + manufactYear + "]";
	}


	
	
	
	
	
}
