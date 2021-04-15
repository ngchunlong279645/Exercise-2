package QUIZ1;

public class Main {

	public static void main(String[] args) {
		Car Proton = new Car();
		
		Proton.setName();
		Proton.setPrice();
		Proton.setNumberOfSeat();
		Proton.setEngineType();

		System.out.println("=========================");
		System.out.println(">>>>CAR INFORMATION<<<<<");
		System.out.println("=========================");
		System.out.println("Name\t\t\t: "+Proton.getName());
		System.out.println("Name\t\t\t: "+Proton.getPrice());
		System.out.println("Name\t\t\t: "+Proton.getNumberOfSeat());
		System.out.println("Name\t\t\t: "+Proton.getEngineType());
	}

}
