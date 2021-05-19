package exampleInterfaceNabstract;

public class Durian extends Apple{
	
	private char thorns;
	protected int calories;
	
		
	
	public Durian(String name, char t, int c, int q, double p) {
		super(name, q, p);
		this.thorns = t;
		this.calories = c;
		System.out.println("Durian constructor is invoked");
		
	}
	
	public char HasThorns() {
		return 'y';
	}
	
	public int calories() {
		return this.calories;
	}
}