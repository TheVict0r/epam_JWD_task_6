package by.jwd.pravdivets.task6.karlssonairlines.entity;

public abstract class Cargo {
	
	private String name;
	private int weight;
	
	public Cargo (String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {//вроде как заново маркировать товар
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
