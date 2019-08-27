package Entities.Plant_Entities;

public class Flower extends Plant {
	
	private Scent smell;
	
//	Constructors
	public Flower(String name) {
		this(name, 0);
	}
	
	public Flower(String name, double height) {
		super(name, height);	
	}
	
//	Getters and Setters
	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return String.format("This is a %s flower,that  mesure : %.2f meter ",
				this.getName(), this.getHeight()) 
				+ "and smelt " + this.getSmell();
	}

	
}
