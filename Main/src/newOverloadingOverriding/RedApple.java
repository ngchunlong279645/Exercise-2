package newOverloadingOverriding;

public class RedApple extends Apple {
	
	private String color;
	private String country;
	private char size;
	
	public RedApple(String name, double p,int q, String color, String country ) {
		super(name, p, q);
		this.color=color;
		this.country=country;

	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public char getSize() {
		return size='M';
	}

	public String toString() {
		return "I have a Red Apple !";
	}
} 


