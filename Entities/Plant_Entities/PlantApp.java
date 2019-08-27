package Entities.Plant_Entities;

public class PlantApp {

	public static void main(String[] args) {

		Bush plant = new Bush("Pin", 3.5);
		plant.setFruit("pome de pin");
		plant.setLeafType(LeafType.NEEDLE);
		System.out.println(plant);
		System.out.println();
		
		Weed weed = new Weed("aweed", 0.5);
		weed.setArea(3.6);
		System.out.println(weed);
		System.out.println();
		
		Flower flower = new Flower("aflower", 1.20);
		flower.setSmell(Scent.MUSKY);
		System.out.println(flower);
		System.out.println();
		
		Tree tree = new Tree("Sobar");
		tree.setHeight(15.2);
		tree.setLeafType(LeafType.NEEDLE);
		System.out.println(tree);
	}

}
