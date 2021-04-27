package Overloading;

public class Apple extends Fruit {
	protected int quantity;
	protected double price;
	
	
	
	public Apple() {		//constructor with no argument
		super();
		quantity=0;
		price=0;
	}
	
	public Apple(String name,int q,int p) {		//constructor with argument
		super(name);
		setInfo(name,q,p);	//call method
	}
	
	public void setInfo(String name,int q,int p) {		//overloading method with 2 parameter
		if(q>0) 
			quantity=q;
		else 
			quantity=0;

		if(p>0) 
			price=p;
		else 
			price=0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return quantity*price;
	}
	
	public double getDiscount() {
		return totalPrice()*0.1;
	}
	
	public double totalPayment() {
		return totalPrice()-getDiscount();
	}
	
	
	public String toString() {		//overriding method
		return 	"Type\t\t: "+name+"\n"+
				"Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+price+"\n"+
				"Total Price\t: RM "+totalPrice()+"\n"+
				"Discount\t: RM "+getDiscount()+"\n"+
				"Total Payment\t: RM "+totalPayment()+"\n";
				
	}

}
