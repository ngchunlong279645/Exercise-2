package QUIZ1;

import java.util.Scanner;

public class Car {
	Scanner scan =  new Scanner(System.in);
	String model;
	double price;
	int numberOfSeat;
	String engineType;
	int quantity;
	double totalPrice;
	
	// Create Setter Method	
		public void setModel() {
			System.out.print("Enter Model\t\t\t  : ");
			this.model=scan.next()+scan.nextLine();
		}
		
		public void setPrice() {
			System.out.print("Enter Price\t\t\t  : ");
			this.price=scan.nextDouble();
		}
		
		public void setNumberOfSeat() {
			System.out.print("Enter Number Of Seat\t\t  : ");
			this.numberOfSeat=scan.nextInt();
		}
		
		public void setEngineType() {
			System.out.print("Enter Engine Type\t\t  : ");
			this.engineType=scan.next()+scan.nextLine();
		}
		
		public void setQuantity() {
			System.out.print("Enter Quantity\t\t\t  : ");
			this.quantity=scan.nextInt();
		}
		
		
		// Create Getter Method
		
		public String getModel() {
			return model;
		}
		
		public double getPrice() {
			return price;
		}
		
		public int getNumberOfSeat() {
			return numberOfSeat;
		}
		
		public String getEngineType() {
			return engineType;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double getTotalPrice() {
			totalPrice = this.price*this.quantity;
			return totalPrice;
		}
		
		
}
