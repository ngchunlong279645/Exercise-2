package InterfaceNabstract;

public class Durian extends Fruit {
	private double weight;
	private char husk;
	
	public Durian(String name,double w,char h) {
		super(name);
		this.weight=w;
		this.husk=h;
		
		if(husk=='N') {
			totalWeight();
			System.out.println("Type\t\t: "+name);
			System.out.println("Unit Price\t: RM "+unitPrice());
			System.out.println("Total Weight\t: "+totalWeight()+" kg");
			System.out.println("Total Price\t: RM "+totalPrice());
		}
		else {
			double huskWeight=2;
			totalWeight(huskWeight);
			double newPrice=30;
			totalPrice(newPrice);
			double tax=0.2;
			double priceAfterTax=unitPrice(newPrice,tax);
			Discount dd = new DurianDiscount();
			double discount=dd.rateOfDiscount();
			totalPrice(priceAfterTax,discount);
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Husk\t\t: "+huskWeight+" kg");
			System.out.println("Total Weight\t: "+totalWeight(huskWeight)+" kg");
			System.out.println("Total Tax\t: "+(tax)*100+"%");
			System.out.println("Unit Price \t: RM "+unitPrice(newPrice,tax));
			System.out.println("Total Price before discount: RM "+totalPrice(priceAfterTax));
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price after discount: RM "+totalPrice(priceAfterTax,discount));
		}
	}
		
	public double totalWeight() {
		return weight;
	}
	
	public double totalWeight(double huskWeight) {
		return weight+huskWeight;
	}

	@Override
	public double totalPrice() {
		return weight*25;
	}
	
	@Override
	public double totalPrice(double newPrice) {
		return weight*newPrice;
	}
	
	@Override
	public double totalPrice(double newPrice, double discount) {
		return (newPrice*weight)*(1-discount);
	}

	@Override
	public double unitPrice() {
		return weight/totalPrice();
	}

	@Override
	public double unitPrice(double newprice, double tax) {
		return  newprice*(1+tax);
	}

	

	

	
}
