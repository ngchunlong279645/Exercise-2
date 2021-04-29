package CorrectionOverLoadingRiding;

public class Orange extends Fruit{

	public void setInfo() {
		System.out.println("Please enter fruit's name, price, and quantity");
	}
	
	public void setInfo(String n) {
		System.out.println( n+" is good for health");
	}
	
	public void setInfo(String n,int p) {
		System.out.println("Unit price for "+n+" : RM "+p);
	}
	
	public void setInfo(String n,int p,int q) {
		System.out.println("Fruit name\t:"+ n);
		System.out.println("Unit Price\t: RM "+p);
		System.out.println("Quantity\t: "+q);
		System.out.println("Total Price\t: RM "+(p*q));
	}
	

}
