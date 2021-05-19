package NEWInterfaceNabstract;

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
			TotalPrice apple= new AppleTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Color\t\t: "+color());
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Price\t: RM "+apple.getTotalPrice(price, quantity));
		}
		else if(quantity>5&&quantity<=10) {
			TotalPrice apple= new AppleTotalPrice();
		
			System.out.println("Type\t\t: "+name);
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Color\t\t: "+color());
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Price\t: RM "+apple.getTotalPrice(quantity));
		}
		else {
			double price = 1.5;
			TotalPrice apple = new AppleTotalPrice();
			
			if(name.equals("Apple")) {
				Discount ad = new AppleDiscount();
				discount = ad.rateOfDiscount();
			}
			else if(name.equals("Durian")) {
				Discount dd = new DurianDiscount();
				discount = dd.rateOfDiscount();
			}
			else if(name.equals("Red Apple")) {
				Discount rad = new RedAppleDiscount();
				discount = rad.rateOfDiscount();
			}					
				
			System.out.println("Type\t\t: "+name);
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Discount\t: "+discount*100+" %");
			System.out.println("Total Price\t: RM "+apple.getTotalPrice(price, quantity,discount));
		}
		
	}

	@Override
	public String taste() {

		return "sweet";
	}

	@Override
	public String color() {
		
		return "red&green";
	}
	


}
