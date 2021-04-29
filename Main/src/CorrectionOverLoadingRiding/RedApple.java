package CorrectionOverLoadingRiding;

public class RedApple extends Apple {
	protected String color;
	protected char size;
	private int weight;
	
	public RedApple(int p,int q,int d,String c,char s) {
		super(p,q,d);
		color=c;
		size=s;
		setWeight();
		setWeight(s);
	}
	
	public void setWeight() {
		weight=0;
	}
	
	public void setWeight(char s) {	
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
	
	
	public String toString() {							 //overriding toString() in SuperClass " Apple "
		return "Type\t\t: RED APPLE \n"+
				"Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+unitprice+"\n"+
				"Color\t\t: "+color+"\n"+
				"Size\t\t: "+size+"\n"+
				"Weight\t\t: "+weight+"\n"+
				String.format("Price Per Gram\t: RM %.2f\n", pricePerGram());
	}

}
