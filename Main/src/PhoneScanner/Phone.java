package PhoneScanner;

import java.util.Scanner;

public class Phone {
	Scanner scan = new Scanner(System.in);
	String brand,color,country;
	int month,quantity;
	double weight,price,total;
	char fingerprint;
	
	//1. method print specification
		void printSpec() {
			System.out.println("Enter brand, price, color, weight and fingerprint :");
			brand = scan.nextLine();
			price = scan.nextDouble();
			scan.nextLine();
			color = scan.nextLine();
			weight = scan.nextDouble();
			fingerprint = scan.next().charAt(0);
			
			System.out.println("Brand \t\t\t: "+brand);
			System.out.println("Price \t\t\t: RM "+price);
			System.out.println("Color \t\t\t: "+color);
			System.out.println("Weight \t\t\t: "+weight+" gram");
			System.out.println("Fingerprint \t\t: "+fingerprint);	
			System.out.println("");
		}
		
	//2. method convert malaysia price to other country price 
		void convert() {
			System.out.println("Enter price and country (USA, Japan, China, Thailand) : ");
			price = scan.nextDouble();
			scan.nextLine();
			country = scan.nextLine();
			
			double output=0;
			String unit=null;
			switch(country) {
			case "USA":
				output=price*0.24;
				unit = "Dollar";
				break;
			case "Japan":
				output=price*26.71;
				unit = "Yen";
				break;
			case "China":
				output=price*1.59;
				unit = "RMB";
				break;
			case "Thailand":
				output=price*7.58;
				unit = "Baht";
				break;
			}
			System.out.printf("Price in %-14s : %.2f %s%n",country,output,unit);
			System.out.println("");
		}
		

	//3. customers choose their payment method 
		void payment() {
			System.out.println("Enter your total price: ");
			price = scan.nextInt();
			System.out.println("HEY! DO YOU WANT INSTALLMENT ?  (Y / N)");
			char option = scan.next().charAt(0);
			if(option=='Y') {	
			System.out.println("Enter month: ");
			month= scan.nextInt();
			
			double pay = (double) price/month;
			System.out.printf("Payment per %d months    : RM %.2f%n",month,pay);
			}
			else if(option=='N') {
				System.out.printf("YOUR TOTAL PRICE IS     : RM %.2f%n",price);
			}
			else {
				System.out.println("INVALID INPUT, PLS TRY AGAIN .....");
			}
			System.out.println("");
		}
		
	//4. method calculate total price
		void totalPrice() {			
			System.out.println("Enter quantity : ");
			quantity= scan.nextInt();
			double[] pr = new double[quantity];
			for(int i=0;i<quantity;i++) {
				System.out.println("Enter price for phone "+(i+1));
				pr[i]=scan.nextDouble();
				total +=pr[i];
			}
			for(int j=0;j<quantity;j++) {
				System.out.printf("Price for phone %d : RM%.2f%n",(j+1),pr[j]);
			}
			System.out.printf("Total price of %d phone  : RM%.2f%n",quantity,total);
			System.out.println("");
		}
	
	//5. method show promotion 
		void promotion() {
			System.out.println("***Promotion! Buy 5 get 1 free Smart Watch  !!");
			System.out.println("***Promotion! Buy 3 get 1 free Sony Earphone!!");
			System.out.println("Enter quantity : ");
			quantity= scan.nextInt();
			
			if (quantity>= 5) {
				System.out.println("***Congratulations, you get a free Smart Watch and Sony Earphone !!***");
			}
			else if (quantity>=3){
				System.out.println("***Congratulations, you get a free Sony Earphone !!***");
			}
			else {
				System.out.println("BUY MORE ! TO GET FREE GIFT...");
				}
			for(int i=0;i<50;i++) {
				System.out.print("=");
		}
			System.out.println("");
		}

		
			

	
}
