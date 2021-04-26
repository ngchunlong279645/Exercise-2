package Overloading;

public class testRun {

	public static void main(String[] args) {
		Orange orange = new Orange(15,4);
		System.out.println("ORANGE\n"+orange);		//print using overriding method
		
		SmallOrange small = new SmallOrange(20,5,'s');
		System.out.println("SMALL ORANGE\n"+small);	//print using overriding method

	}

}
