package QUIZ1;

public class Main {

	public static void main(String[] args) {
		Car Proton = new Car();
		
		Proton.setModel();
		Proton.setPrice();
		Proton.setNumberOfSeat();
		Proton.setEngineType();
		Proton.setQuantity();

		System.out.println("=========================");
		System.out.println(">>>>CAR INFORMATION<<<<<");
		System.out.println("=========================");
		System.out.println("Model\t\t\t\t: "+Proton.getModel());
		System.out.println("Price\t\t\t\t: "+Proton.getPrice());
		System.out.println("Number of seat\t\t\t: "+Proton.getNumberOfSeat());
		System.out.println("Engine Type\t\t\t: "+Proton.getEngineType());
		System.out.println("Quantity\t\t\t: "+Proton.getQuantity());
		System.out.println("Total price\t\t\t: "+Proton.getTotalPrice());
	}

}
