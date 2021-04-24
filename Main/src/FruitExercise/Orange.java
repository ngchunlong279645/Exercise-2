package FruitExercise;

public class Orange extends Fruit {
	
	private String country;
	private int vitA, vitC;

	public Orange(String name,String country,int vitA,int vitC) {
		super(name);
		this.country = country;
		this.vitA=vitA;
		this.vitC=vitC;
	}
	
	public int getVitA() {
		return vitA;
	}
	
	public int getVitC() {
		return vitC;
	}
	
	
	public String toString() {
		
		return  super.toString()+"\n"+
				super.getName()+" is come from "+country;
	}
	
	
}
