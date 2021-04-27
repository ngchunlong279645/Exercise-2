package Overloading;

public class Banana extends Fruit  {
	private double weight;
	
	public Banana() {
		super();
		weight=0;
	}
	
	public Banana(String name,double weight) {
		super(name);
		setInfo(name,weight);
	}
	
	public void setInfo(String name,double weight) {
		if(weight>0)
			this.weight=weight;
		else
			weight=0;
	}

	public double getCalories() {
		return weight*89/100;
	}
	
	public String toString() {  
		
		return  "Type\t\t: "+name+"\n"+
				"Weight(g)\t: "+weight+"\n"+
				"Caloriest\t: "+getCalories()+"\n";
	}
}
