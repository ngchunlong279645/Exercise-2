package exampleInterfaceNabstract;

import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit("Orange"); //no need new object for super class
		
		System.out.println();
		
		Apple a = new Apple("Apple", 5000, 2.99); //new object for sub class
						
		RedApple r = new RedApple("Red apple", 6666, 7.92, 6, "bright red");
				
		GreenApple g = new GreenApple("Green Apple", 50, 0.98, null, true);
		
		
		Durian d = new Durian("Durian", 'y', 885, 200, 3.99);
		System.out.println("Does the durian have thorns?: " + d.HasThorns());
		System.out.println("Calories(calories): " + d.calories());
		
		System.out.println();
		
		/*Mango m = new Mango("Mango", "medium", 200);
		System.out.println("Size: " + m.sizeMango());
		System.out.println("This " + m.sizeMango() + " size of mango has the weight of " + m.weightMango() + "g.");
		*/
	}
}