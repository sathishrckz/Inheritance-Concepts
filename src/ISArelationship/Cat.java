package ISArelationship;

public class Cat extends Animal {
	
	private String color;

	public Cat(boolean vegetarian, String eats, int noOfLegs) {
		super(vegetarian, eats, noOfLegs);
	
	}
	
	public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
		super(vegetarian, eats, noOfLegs);
		this.color = color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
