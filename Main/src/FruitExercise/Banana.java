package FruitExercise;

public class Banana extends Fruit {
	private double weight;
	
	public Banana(String name,double weight){
		super(name);
		this.weight=weight;
	}
	
	public double getCalories() {
		return weight*89/100;
	}
	
	public String toString() {  
		
		return  super.toString()+"\n"+
				super.getName()+" weight(g) : "+weight+"\n"+
				super.getName()+" calories : "+getCalories();
	}
}
