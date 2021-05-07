package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class CargoUnit implements Serializable{
	
	private String name;
	private double weight;
		
	
	
	public CargoUnit (String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {//вроде как заново маркировать товар
		this.name = name;
	}

	public double getUnitWeight() {
		return weight;
	}

	public void setUnitWeight(int weight) {
		this.weight = weight;
	}
	
	
}
