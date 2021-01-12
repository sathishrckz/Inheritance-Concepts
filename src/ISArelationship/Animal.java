package ISArelationship;

public class Animal {
	
	//variables
	
	private boolean vegetarian;	
	private String eats;
	private int NoOfLegs;
	
	//consructor
	
	public Animal() {}
	
	public Animal(boolean vegetarian, String eats, int noOfLegs) {
		super();
		this.vegetarian = vegetarian;
		this.eats = eats;
		NoOfLegs = noOfLegs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return NoOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		NoOfLegs = noOfLegs;
	}
	
	
	
	

}
