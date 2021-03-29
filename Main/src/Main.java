
public class Main {

	public static void main(String[] args) {
		myPhone a = new myPhone ();
		phoneBen b = new phoneBen ();
		
		printInfo(a.Brand,a.price,a.color,a.volume);
		System.out.println("If press button (+) ");
		a.volup();
		a.printVol(a.volume);
		System.out.println("If press button (-) ");
		a.voldown();
		a.voldown();
		a.printVol(a.volume);
		a.startCall();
		a.endCall();
		
		System.out.println("***********************************************************");
		
		printInfo(b.Brand,b.price,b.color,b.volume);
		System.out.println("If press button (+) ");
		b.volup();
		b.printVol(b.volume);
		System.out.println("If press button (-) ");
		b.voldown();
		b.voldown();
		b.printVol(b.volume);
		b.startCall();
		b.endCall();
		

	}
	
	public static void printInfo(String brand, int price, String color, int volume) {
		
		System.out.println("Brand \t\t\t: "+brand);
		System.out.println("Price \t\t\t: RM "+price);
		System.out.println("Color \t\t\t: "+color);
		System.out.println("Volume \t\t\t: "+volume);
		
	}
	
	
	
	 
}
