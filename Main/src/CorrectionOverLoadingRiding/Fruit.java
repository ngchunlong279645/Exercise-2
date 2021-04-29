package CorrectionOverLoadingRiding;

public class Fruit {
	protected String name;
	
	public Fruit () {
		name=null;
	}
	
	public Fruit(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // overriding
		return name+" is good for health";
	}

}
