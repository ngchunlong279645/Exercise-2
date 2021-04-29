package CorrectionOverLoadingRiding;

public class Main {

	public static void main(String[] args) {
		
		Fruit fruit = new Fruit("FRUIT");
		System.out.println(fruit+"\n");
		
		Apple apple = new Apple (10,5,10);
		System.out.println(apple);
		
		RedApple redapple = new RedApple(20,5,20,"RED",'s');
		System.out.println(redapple);
		
		
		Orange orange = new Orange();
		orange.setInfo();
		orange.setInfo("ORANGE");
		orange.setInfo("ORANGE", 12);
		orange.setInfo("OrAnGe", 10, 5);
		System.out.println(orange+"\n");
		
		BigOrange bigorange = new BigOrange();
		bigorange.setInfo();
		bigorange.setInfo("BIG ORANGE");
		bigorange.setInfo("orange", 5);
		bigorange.setInfo("ORANGE", 10, 5); 
		bigorange.setInfo("oRANge", 20, "JAPAN");

	}

}
