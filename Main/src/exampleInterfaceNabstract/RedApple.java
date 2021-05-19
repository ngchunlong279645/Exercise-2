package exampleInterfaceNabstract;

public class RedApple extends Apple {
	
	private String colour;
	private int pack;
	
	public RedApple(String name, int q, double p, int pk, String c) {
		super(name, q, p);
		this.pack = pk;
		this.colour = c;
		
		
	}
	
	public String colour() {
		return this.colour;
	}
	
	public int packRedApple() {
		return this.pack;
	}
	
	public double calPrice() {
		return (super.quantity/this.pack) * super.price;
	}

}