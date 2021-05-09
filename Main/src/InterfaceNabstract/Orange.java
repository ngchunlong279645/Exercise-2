package InterfaceNabstract;

public class Orange extends Fruit {
	private double price;
	private String country;
	
	public Orange(String name,double price,String country) {
		super(name);
		this.price=price;
		this.country=country;
		
		if(country.equals("Japan")) {
			unitPrice();
			System.out.println("Type\t\t: "+name);
			System.out.println("Country\t\t: "+country);
			System.out.println("Total Tax\t: 0%");
			System.out.println("Unit Price\t: RM "+unitPrice());
			System.out.println("Total Price\t: RM "+totalPrice());
			System.out.println("Total Weight\t: "+totalWeight()+" kg");
		}
		else if(country.equals("USA")) {
			double tax=0.1;
			unitPrice(tax);
			double newPrice=unitPrice(tax);
			totalPrice(newPrice);
			double plasticbox=0.3;
			totalWeight(plasticbox);
			System.out.println("Type\t\t: "+name);
			System.out.println("Country\t\t: "+country);
			System.out.println("Total Tax\t: "+tax*100+"%");
			System.out.println("Unit Price\t: RM "+unitPrice(tax));
			System.out.println("Total Price\t: RM "+totalPrice(newPrice));
			System.out.println("Total Weight\t: "+totalWeight(plasticbox)+" kg");
		}
		
		else if(country.equals("Korea")) {
			double importTax=0.15;
			double serviceTax=0.10;
			unitPrice(importTax,serviceTax);
			double newPrice=unitPrice(importTax,serviceTax);
			totalPrice(newPrice);
			double metalbox=0.45;
			totalWeight(metalbox);
			Discount oo = new OrangeDiscount();
			double discount=oo.rateOfDiscount();
			totalPrice(newPrice,discount);
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Country\t\t: "+country);
			System.out.println("Total Tax\t: "+(importTax+serviceTax)*100+"%");
			System.out.println("Unit Price\t: RM "+unitPrice(importTax,serviceTax));
			System.out.println("Total Price before discount: RM "+totalPrice(newPrice));
			System.out.println("Total Weight\t: "+totalWeight(metalbox)+" kg");
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price after discount: RM "+totalPrice(newPrice,discount));
		}
	}
	
	public double unitPrice() {
		return price;
	}
	
	public double unitPrice(double tax) {
		return price*(1+tax);
	}
	
	public double unitPrice(double importTax,double serviceTax) {
		return price*(1+importTax+serviceTax);
	}

	@Override
	public double totalPrice() {
		return unitPrice()*15;
	}
	
	@Override
	public double totalPrice(double newPrice) {
		return newPrice*15;
	}
	
	@Override
	public double totalPrice(double newPrice, double discount) {
		return (newPrice*15)*(1-discount);
	}

	@Override
	public double totalWeight() {
		return 3;
	}

	@Override
	public double totalWeight(double container) {
		return 3+container;
	}

	

	
	
	
}

