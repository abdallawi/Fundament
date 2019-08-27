package Entities.Plant_Entities;

public class Tree extends Plant {
	
	private LeafType leafType;
	
//	Constructors
		public Tree(String name) {
			this(name, 0);
		}
		
		public Tree(String name, double height) {
			super(name, height);	
		}
	
	
//	Getters and Setters
	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return String.format("This is a %s tree,  mesure : %.2f meter ",
				this.getName(),  this.getHeight()) +
				"and the Leaf type is: " + this.leafType;
	}
	
	
}
