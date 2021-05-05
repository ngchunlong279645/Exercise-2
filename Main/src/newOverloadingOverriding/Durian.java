package newOverloadingOverriding;

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
			System.out.println("Total Weight\t: "+totalWeight()+" kg");
		}
		else {
			double huskWeight=2;
			totalWeight(huskWeight);
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Husk\t\t: "+huskWeight+" kg");
			System.out.println("Total Weight\t: "+totalWeight(huskWeight)+" kg");
		}
	}
		
	public double totalWeight() {
		return weight;
	}
	
	public double totalWeight(double huskWeight) {
		return weight+huskWeight;
	}
}
