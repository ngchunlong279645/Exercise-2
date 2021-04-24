package FruitExercise;

public class Apple extends Fruit {
	
	private double price;
	private int quantity;
	
	
	public Apple (String name,int q, double p) {
		super(name);
		this.quantity=q;
		this.price=p;
}
	public double totalPrice() {
		return quantity*price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return  super.toString()+"\n"+
				super.getName()+" Quantity : "+quantity+"\n"+
				super.getName()+" Price : RM " +price;
	}
}
