package QUIZ1;

public class Main {

	public static void main(String[] args) {
		Car Proton = new Car();
		Car BMW = new Car();
		
		Proton.setModel();
		Proton.setPrice();
		Proton.setNumberOfSeat();
		Proton.setEngineType();
		Proton.setQuantity();
		
		System.out.println("=========================");
		System.out.println(">>>>PROTON INFORMATION<<<<<");
		System.out.println("=========================");
		System.out.println("Model\t\t\t\t: "+Proton.getModel());
		System.out.println("Price\t\t\t\t: "+Proton.getPrice());
		System.out.println("Number of seat\t\t\t: "+Proton.getNumberOfSeat());
		System.out.println("Engine Type\t\t\t: "+Proton.getEngineType());
		System.out.println("Quantity\t\t\t: "+Proton.getQuantity());
		System.out.println("Total price\t\t\t: "+Proton.getTotalPrice());
		
		System.out.println("");
		BMW.setModel();
		BMW.setPrice();
		BMW.setNumberOfSeat();
		BMW.setEngineType();
		BMW.setQuantity();
				
		System.out.println("=========================");
		System.out.println(">>>>BMW INFORMATION<<<<<");
		System.out.println("=========================");
		System.out.println("Model\t\t\t\t: "+BMW.getModel());
		System.out.println("Price\t\t\t\t: "+BMW.getPrice());
		System.out.println("Number of seat\t\t\t: "+BMW.getNumberOfSeat());
		System.out.println("Engine Type\t\t\t: "+BMW.getEngineType());
		System.out.println("Quantity\t\t\t: "+BMW.getQuantity());
		System.out.println("Total price\t\t\t: "+BMW.getTotalPrice());
	}

}
