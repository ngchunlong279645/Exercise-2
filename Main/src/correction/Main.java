package correction;

public class Main {

	public static void main(String[] args) {
		phone myphone = new phone();
		phone benphone = new phone();
		
		myphone.brand="SAMSUNG";
		myphone.color="RED";
		myphone.price=399;
		myphone.volume=10;
		
		printInfo(myphone);
		System.out.println("If press button (+) ");
		myphone.volup();
		System.out.println("The volume will become \t: "+myphone.volume);
		System.out.println("If press button (-) ");
		myphone.voldown();
		myphone.voldown();
		System.out.println("The volume will become \t: "+myphone.volume);
		
		System.out.println("====================================");
		
		benphone.brand="IPHONE";
		benphone.color="PINK";
		benphone.price=499;
		benphone.volume=40;
		
		printInfo(benphone);
		System.out.println("If press button (+) ");
		benphone.volup();
		System.out.println("The volume will become \t: "+benphone.volume);
		System.out.println("If press button (-) ");
		benphone.voldown();
		benphone.voldown();
		System.out.println("The volume will become \t: "+benphone.volume);
		
		

	}
	public static void printInfo(phone whosephone) {
			
		System.out.print("Brand \t\t\t: ");
		whosephone.getbrand();
		System.out.print("Price \t\t\t: ");
		whosephone.getprice();
		System.out.print("Color \t\t\t: ");
		whosephone.getcolor();
		System.out.println("The current volume \t: "+whosephone.volume);
		
	}

}
