package InterfaceNabstract;

public class GreenApple extends Apple{

	private String color;
	private char size;
	
	public GreenApple(String name, double p,int q, String c, char s) {
		super(name, p, q);
		color = c;
		size = s;
		
	}
	
	public double totalPrice(double newPrice,double discount) {
		return (newPrice*quantity)*(1-discount);
	}
	
	public String getColor() {
		return color;
	}
	
	public char getSize() {
		return size;
		
	}
	
	
}