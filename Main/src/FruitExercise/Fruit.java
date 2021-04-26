package FruitExercise;

public class Fruit {
	private String name;

	public Fruit (String name) {
		this.name = name;
		System.out.println(name+" constructor is invoked");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // overriding
		return name+" is good for health";
	}

}
