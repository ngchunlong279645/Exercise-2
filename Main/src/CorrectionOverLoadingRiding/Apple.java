package CorrectionOverLoadingRiding;

public class Apple extends Fruit {
	protected int quantity;
	protected double price;
	protected double unitprice;
	protected double payment;
	protected double total;
	
	public Apple() {		
		super();
		quantity=0;
		price=0;
	}
	
	public Apple(int p,int q,int d) {
		price=p;
		quantity=q;
		totalPrice();
		totalPrice(p);	
		totalPrice(p,q);
		totalPrice(p,q,d);
	}
	
	public double totalPrice() {
		return total=0;
	}
	
	public double totalPrice(int p) {
		return unitprice=p;
	}
	
	public double totalPrice(int p,int q) {	
		total=p*q;
		return total;
	}
	
	public double totalPrice(int p,int q,int d) {
		payment=(p*q)*(100-d)/100;
		return payment;
	}
	
	public String toString() {                       //overriding toString() in SuperClass " Fruit "
		return 	"Type\t\t: Apple \n"+
				"Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+unitprice+"\n"+
				"Total Price\t: RM "+total+"\n"+
				"Total Payment\t: RM "+payment+"\n";
		
		
	}
	

}
