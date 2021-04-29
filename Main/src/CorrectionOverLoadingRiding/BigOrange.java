package CorrectionOverLoadingRiding;

public class BigOrange extends Orange {

	public void setInfo() {
		System.out.println("THIS IS A FRUIT");    		//overriding superclass " Orange " setInfo() method;
	}
	
	public void setInfo(String n) {						 //overriding superclass " Orange " setInfo(String n) method;
		System.out.println("THIS IS AN "+n);
	}
	
	public void setInfo(String n, int p) {				 //overriding superclass " Orange " setInfo(String n, int p) method;
		System.out.println("PRICE OF AN ORANGE IS : RM "+p);
	}
	
	public void setInfo(String n, int p,String c) {		 //overriding superclass " Orange " setInfo(String n, int p,String c) method;
		System.out.println("Fruit\t\t: "+n);
		System.out.println("Price\t\t: RM "+p);
		System.out.println("Import\t\t: "+c);
	}
	
	
	

}
