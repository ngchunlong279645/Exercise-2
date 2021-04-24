package FruitExercise;

public class greenApple extends Apple {
	private int weight;
	
	public greenApple(String name, int q, int p,int w) {
		super(name,q,p);
		this.weight=w;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getTotalWeight() {
		return super.getQuantity()*getWeight();
	}
	
	public int getBox() {
		return super.getQuantity()/10;
	}
	
	public String toString() {
		return super.toString()+"\n"+
			   super.getName()+" weight(g) : "+getWeight()+"\n"+
			   "1 box can store 10 "+super.getName();
	}

}
