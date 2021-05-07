package by.jwd.pravdivets.task6.karlssonairlines.entity;

public abstract class Cargo {
	
	private int weight;
	
	public Cargo (int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
