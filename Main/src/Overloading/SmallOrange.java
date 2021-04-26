package Overloading;

public class SmallOrange extends Orange {		//sub class
	private char size;
	private int weight;

	public SmallOrange() {		//constructor for sub class
		super();				//inherit data,method from super class (constructor with no argument)
		size= ' ';
	}
	
	public SmallOrange(int q,int p,char s) {		//constructor sub class with argumnet
		super(q,p);		//called method in superclass with passing parameter
		size=s;
		
		setInfo(q,p,s);	//method for overloading
	}
	
	public void setInfo(int q,int p,char s) {	//overloading method with 3 parameter
		if(s=='s')
			weight=70;
		else if(s=='m')
			weight=100;
		else if(s=='l')
			weight=120;	
	}
	
	public char getSize() {
		return size;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public double pricePerGram() {
		return price/weight;
	}
	
	public String toString() {		//overriding method
		return "Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+price+"\n"+
				"Size\t\t: "+size+"\n"+
				"Weight\t\t: "+weight+"\n"+
				String.format("Price Per Gram\t: RM %.2f\n", pricePerGram());
	}
	
}
