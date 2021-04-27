package Overloading;

public class Orange extends Fruit {
	protected int vitA;
	protected int vitB;
	
	public Orange(String name,int a,int b) {
		super(name);
		setInfo(name,a,b);
	}
	
	public void setInfo(String name,int a,int b) {
		if(a>0)
			vitA=a;
		else
			vitA=0;
		if(b>0)
			vitB=b;
		else
			vitB=0;
	}
	
	public int getVitA() {
		return vitA;
	}
	
	public int getVitB() {
		return vitB;
	}
	
	public int totalVit() {
		return vitA+vitB;
	}
	
	public String toString() {		//overriding method
		return 	"Type\t\t: "+name+"\n"+
				"Vitamin A\t: "+vitA+"\n"+
				"Vitamin B\t: "+vitB+"\n"+
				"Total Vitamin\t: "+totalVit()+"\n";
	}
}
