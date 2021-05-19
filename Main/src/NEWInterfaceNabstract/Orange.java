package NEWInterfaceNabstract;

public class Orange extends Fruit {
	private double price;
	private double weight;
	
	public Orange (String name, double p, double w) {
		super(name);
		price=p;
		weight=w;
		
		if(weight<=10) {
			TotalPrice orange = new OrangeTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Total Price\t: RM "+orange.getTotalPrice(price,weight));
		}
		else if(weight>10&&weight<=20) {
			TotalPrice orange = new OrangeTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Color\t\t: "+color());
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Total Price\t: RM "+orange.getTotalPrice(weight));
		}
		else {
			TotalPrice orange = new OrangeTotalPrice();
			double tax =0.05;
			double price =8;
				
			System.out.println("Type\t\t: "+name);
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Color\t\t: "+color());
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Tax\t\t: "+tax*100+" %");
			System.out.println("Total Price\t: RM "+orange.getTotalPrice(price,weight, tax));
		}
		
	}


	public String taste() {

		return "sour";
	}


	@Override
	public String color() {

		return "orange";
	}

}
