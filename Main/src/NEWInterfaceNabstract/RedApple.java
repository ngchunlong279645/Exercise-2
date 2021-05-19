package NEWInterfaceNabstract;

public class RedApple extends Apple {
	private String country;
	private char size;
	
	public RedApple(String name, double p, int q,String c, char s) {
		super(name, p, q);
		country=c;
		size=s;
	}
	
	public String getCountry() {
		return country;
	}
	
	public char getSize() {
		return size;
	}

}
