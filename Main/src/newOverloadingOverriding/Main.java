package newOverloadingOverriding;

public class Main {

	public static void main(String[] args) {

		Fruit f = new Fruit("Fruit");
		
		System.out.println("-----------------APPLE-----------------");
		Apple a = new Apple("Apple",3,2);
		System.out.println("Size\t\t: "+a.getSize());
		System.out.println(a+"\n");
		
		System.out.println("-----------------GREEN APPLE-----------------");
		GreenApple g = new GreenApple("GreenApple",4,6,"Green",'s');
		System.out.println("Color\t\t: "+g.getColor());
		System.out.println("Size\t\t: "+g.getSize());   //overriding Apple class "getSize()"
		System.out.println(g+"\n");						//overriding Apple class "toString()"
		
		
		System.out.println("-----------------RED APPLE-----------------");
		RedApple r = new RedApple("RedApple",3.5,15,"Red","England");
		System.out.println("Color\t\t: "+r.getColor());
		System.out.println("Import\t\t: "+r.getCountry());
		System.out.println("Size\t\t: "+r.getSize());	//overriding Apple class "getSize()"
		System.out.println(r+"\n");						//overriding Apple class "toString()"
		
		System.out.println("-----------------ORANGE-----------------");
		Orange o = new Orange("Orange",4.5,"USA");
		System.out.println("");
		
		System.out.println("-----------------DURIAN-----------------");
		Durian d = new Durian("Durian",5.5,'Y');
		System.out.println("");
		
	
		

	}

}
