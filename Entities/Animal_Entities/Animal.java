package Entities.Animal_Entities;

public class Animal  {
	
	private String name;
	private double weight;
	private double height;
	private double length;

	//Constructors
	public Animal(String name) {
		this(name, 0,0,0);
	}

	public Animal(String name, double weight, double height,double length) {
		this.name = name;
		this.weight = weight;
		this.height= height;
		this.length = length;
	}
	
	//Getters and Setters 
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeigh(double height){
		this.height= height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
