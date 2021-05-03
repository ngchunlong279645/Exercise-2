package newOverloadingOverriding;

public class Apple extends Fruit {
	private double price;
	private int quantity;
	
	public Apple(String name,double p,int q) {
		super(name);
		price=p;
		quantity=q;
		
		if(quantity<=5) {
			totalPrice();
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+price);
			System.out.println("Total Price\t: RM "+totalPrice());
		}
		else if(quantity>5&&quantity<=10) {
			double newPrice=2.00;
			totalPrice(newPrice);
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newPrice);
			System.out.println("Total Price\t: RM "+totalPrice(newPrice));
		}
		else {
			double newPrice=1.50;
			double discount=0.15;
			totalPrice(newPrice,discount);
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newPrice);
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price\t: RM "+totalPrice(newPrice,discount));
		}
		
	}
	
	public double totalPrice() {
		return price*quantity;
	}
	
	public double totalPrice(double newPrice) {
		return newPrice*quantity;
	}
	
	public double totalPrice(double newPrice,double discount) {
		return (newPrice*quantity)*(1-discount);
	}
	
	public String toString() {
		return "I have an Apple !";
	}
}
