package ISArelationship;

public class TestISArelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat(false, "fish", 4);
		c.setcolor("white");
		
		System.out.println("Cat is a vegetarian? "+c.isVegetarian());
		System.out.println("Cat eats "+c.getEats());
		System.out.println("Cat has "+c.getNoOfLegs()+" legs");
		System.out.println("Cat color is  "+c.getColor());

	}

}
