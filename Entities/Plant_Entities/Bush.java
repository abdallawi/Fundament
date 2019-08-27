package Entities.Plant_Entities;

public class Bush extends Plant {

	private String fruit;
	private LeafType leafType;
	
//	Constructors
	public Bush(String name) {
		this(name, 0);
		
	}
	
	public Bush(String name, double height) {
		super(name, height);	
	}

//	Getters and Setters
	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}
	
	@Override
	public String toString() {
		return String.format("This is a %s bush, with fruit called %s,  mesure : %f meter ",
				this.getName(), this.getFruit(), this.getHeight()) 
				+ "and the Leaf type is: " + this.leafType;
	}
	
}
