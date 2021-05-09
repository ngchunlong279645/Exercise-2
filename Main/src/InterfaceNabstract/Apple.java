package InterfaceNabstract;

public class Apple extends Fruit {
	protected double price;
	protected int quantity;
	private char size;
	protected double discount;
	
	public Apple(String name,double p,int q) {
		super(name);
		price=p;
		quantity=q;
		
		if(quantity<=5) {
			totalPrice();	//overloading with no argument
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Weight\t: "+totalWeight()+" kg");
			System.out.println("Unit Price\t: RM "+unitPrice());
			System.out.println("Total Price\t: RM "+totalPrice());
		}
		else if(quantity>5&&quantity<=10) {
			double newPrice=2.00;	//set new price
			totalPrice(newPrice);	//overloading with 1 argument
			double tupperware = 0.7;	//set tupperware weight
			totalWeight(tupperware);	//overloading with 1 argument, totalWeight = normal weight+tupperware weight
			double tax=0.12;	//set tax %
			double priceAfterTax=unitPrice(newPrice,tax);	//overloading with 2 arguments, priceAfterTax = newPrice + tax
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Weight\t: "+totalWeight(tupperware)+" kg");
			System.out.println("Total Tax\t: "+tax*100+"%");
			System.out.println("Unit Price\t: RM "+unitPrice(newPrice,tax));
			System.out.println("Total Price\t: RM "+totalPrice(priceAfterTax));
		}
		else {
			double box = 1;
			totalWeight(box);	//overloading with 1 argument, totalWeight = normal weight+box weight
			double newPrice=1.50;	//set newPrice
			double tax=0.15;	//set tax %
			double priceAfterTax=unitPrice(newPrice,tax);	//overloading with 2 arguments
			Discount aa = new AppleDiscount();
			discount=aa.rateOfDiscount();
			totalPrice(priceAfterTax,discount);		//overloading with 2 arguments
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Weight\t: "+totalWeight(box)+" kg");
			System.out.println("Total Tax\t: "+tax*100+"%");	
			System.out.println("Unit Price\t: RM "+unitPrice(newPrice,tax));
			System.out.println("Total Price before discount: RM "+totalPrice(priceAfterTax));
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price after discount: RM "+totalPrice(priceAfterTax,discount));
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

	@Override
	public double totalWeight() {
		return quantity*0.3;
	}
	
	@Override
	public double totalWeight(double newWeight) {
		return (quantity*0.3)+newWeight;
	}

	@Override
	public double unitPrice() {
		return price;
	}

	@Override
	public double unitPrice(double newprice,double tax) {
		return  newprice*(1+tax);
	}

	
}



