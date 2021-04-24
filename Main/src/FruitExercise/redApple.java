package FruitExercise;

public class redApple extends Apple {
	private String color;
	private char size;
	private String SIZE;
	private double discount;
	
	public redApple (String name,int q, double p,String c,char size) {
		super(name,q,p);
		this.color=c;
		this.size=size;
	}

	public double getDiscount() {
		if(size=='S') 
			discount=10;
		else if(size=='M')
			discount=15;
		else if(size=='L')
			discount=20;
		return discount;	
	}
	
	public double payment() {
		return super.totalPrice()*(100-discount)/100;
	}
	
	public String toString() {
		return super.toString()+"\n"+
				super.getName()+" color : "+color+"\n"+
				super.getName()+" size : "+size;
	}
}
