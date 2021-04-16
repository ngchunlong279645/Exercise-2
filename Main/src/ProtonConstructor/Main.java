package ProtonConstructor;

public class Main {

	public static void main(String[] args) {
	
		Proton p = new Proton();
		System.out.println("Brand Color Speed: " + p.brand + " " + p.color + " " + p.maxSpeed);
		
		Proton pp = new Proton("X50", "GREEN", 300);
		System.out.println("Brand Color Speed: " + pp.brand + " " + pp.color + " " + pp.maxSpeed);
			

	}

}
