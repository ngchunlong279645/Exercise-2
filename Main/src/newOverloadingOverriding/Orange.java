package newOverloadingOverriding;

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
		}
		else if(country.equals("USA")) {
			double tax=0.1;
			unitPrice(tax);
			System.out.println("Type\t\t: "+name);
			System.out.println("Country\t\t: "+country);
			System.out.println("Total Tax\t: "+tax*100+"%");
			System.out.println("Unit Price\t: RM "+unitPrice(tax));
		}
		
		else if(country.equals("Korea")) {
			double importTax=0.15;
			double serviceTax=0.10;
			unitPrice(importTax,serviceTax);
			System.out.println("Type\t\t: "+name);
			System.out.println("Country\t\t: "+country);
			System.out.println("Total Tax\t: "+(importTax+serviceTax)*100+"%");
			System.out.println("Unit Price\t: RM "+unitPrice(importTax,serviceTax));
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
	
	
}
