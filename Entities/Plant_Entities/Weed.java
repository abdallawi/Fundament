package Entities.Plant_Entities;

public class Weed extends Plant {
	private double area;
	
//	Constructors
	public Weed(String name) {
		this(name, 0);
			
	}
		
	public Weed(String name, double height) {
		super(name, height);	
	}

//	Getters and setters
		public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return String.format("This is a %s weed, with an area of %.2f ,  mesure : %f meter ",
			this.getName(), this.getArea(), this.getHeight()) ;
					
	}
		
		
	
		
	
		
}
