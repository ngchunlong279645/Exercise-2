package exampleInterfaceNabstract;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) { //constructor with 3 arguments
		super(name);
		this.quantity = q;
		this.price = p;
		
		//System.out.println("Apple constructor is invoked");
	
		if (this.quantity < 10) {
			totalPrice(); //overloading with no arguments sbb harga dan kuantiti sama/tak berubah
			System.out.println(name);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 1.99; // beli lebi dari 10 tapi kurang dari 100, harga 1.99
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
		}
		
			else {
			double pp = 0.99; //beli lebih drp 100, harga menjadi 0.99
			double dd; //beli byk lebih daripada 100, ada diskaun 10%
			
			
			if (name =="Apple" || name == "Red apple") {
				Discount aa = new AppleDiscount(); //create new object	
				System.out.println("DISCOUNT 1: "+aa.rateOfDiscount()); 
				dd = aa.rateOfDiscount();
			}
			else {
				Discount aa = new DurianDiscount(); //create new object
				System.out.println("DISCOUNT 2 : "+aa.rateOfDiscount()); 
				dd =aa.rateOfDiscount();
			}
			totalPrice(dd, pp); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(dd,pp));
		}
		
	}
	
	
	public double totalPrice() {
		return this.price * this.quantity;
		
	}
	
	public double totalPrice(double pr) {
		return pr * this.quantity;
	}
	
	public double totalPrice(double qq, double pr) {
		return (pr * this.quantity) * qq;
	}
	
}

