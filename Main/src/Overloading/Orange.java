package Overloading;

public class Orange {
	protected int quantity;
	protected double price;
	
	
	
	public Orange() {		//constructor with no argument
		quantity=0;
		price=0;
	}
	
	public Orange(int q,int p) {		//constructor with argument
		setInfo(q,p);	//call method
	}
	
	public void setInfo(int q,int p) {		//overloading method with 2 parameter
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
		return "Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+price+"\n"+
				"Total Price\t: RM "+totalPrice()+"\n"+
				"Discount\t: RM "+getDiscount()+"\n"+
				"Total Payment\t: RM "+totalPayment()+"\n";
				
	}

}
