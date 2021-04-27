package Overloading;

public class testRun {

	public static void main(String[] args) {
		Apple apple = new Apple("APPLE",15,4);
		System.out.println(apple);		//print using overriding method
		
		SmallApple small = new SmallApple("SMALL APPLE",20,5,'s');
		System.out.println(small);		//print using overriding method
		
		GreenApple green = new GreenApple("GREEN APPLE",15,10,'y',"Green");
		System.out.println(green);		//print using overriding method

		Banana banana = new Banana("BANANA",250);
		System.out.println(banana); 	//print using overriding method
		
		Orange orange = new Orange("ORANGE",88,12);
		System.out.println(orange);		//print using overriding method
	}

}
