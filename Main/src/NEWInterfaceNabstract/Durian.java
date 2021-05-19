package NEWInterfaceNabstract;

public class Durian extends Apple {
	private double weight;
	private char husk;
	
	public Durian(String name, double p, int q,int w,char h) {
		super(name,p,q);
		weight=w;
		husk=h;
	}
	
	public char hasHusk() {
		return husk;
	}
	
	public double getWeight() {
		return weight;
	}

}
