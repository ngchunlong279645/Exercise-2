package Overloading;

public class Fruit {
	protected String name;
	
	public Fruit () {
		name=null;
	}
	
	public Fruit(String name) {
		setInfo(name);
	}
	
	public void setInfo(String name) {
		if(name!=null)
			this.name=name;
		else
			this.name=null;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // overriding
		return name+" is good for health";
	}


}
