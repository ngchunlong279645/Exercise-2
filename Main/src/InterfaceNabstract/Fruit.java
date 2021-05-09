package InterfaceNabstract;

public abstract class Fruit {	//defined superclass as abstract class
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	//methods in super class
	public String toString() {
		return name+" constructor is invoked";
	}
	
	//abstraction for super class
	//declare a method that has no implementation 
	//an abstract method has only the heading with no body.
	public abstract double totalPrice(); 
	public abstract double totalPrice(double newPrice);
	public abstract double totalPrice(double newPrice,double discount);
	
	public abstract double totalWeight();
	public abstract double totalWeight(double additionalWeight);
	
	public abstract double unitPrice();
	public abstract double unitPrice(double newprice,double tax);
	
}
