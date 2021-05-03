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
			double husk=2;
			totalWeight(husk);
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight+" kg");
			System.out.println("Husk\t\t: "+husk+" kg");
			System.out.println("Total Weight\t: "+totalWeight(husk)+" kg");
		}
	}
		
	public double totalWeight() {
		return weight;
	}
	
	public double totalWeight(double husk) {
		return weight+husk;
	}
}
