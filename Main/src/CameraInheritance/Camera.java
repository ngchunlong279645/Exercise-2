package CameraInheritance;

import java.util.Scanner;

public class Camera {
	
	Scanner scan = new Scanner(System.in);
	private double price;
	private int quantity;
	
	public Camera(){
		System.out.print("Please enter price\t\t\t: RM");
		price=scan.nextDouble();
		System.out.print("Please enter quantity\t\t\t: ");
		quantity=scan.nextInt();
	}
	
	public double getPrice() {
	       return price;
	   }
	
	public int getQuantity() {
	       return quantity;
	   }
	
	public double getTotalPrice() {
		return price*quantity;
	}
	
	public String toString() {
		return 	"-----------------------RECEIPT---------------------\n"
				+"Unit Price\t\t\t\t: RM"+price+"\nTotal Quantity\t\t\t\t: "+quantity;
	}
	

}
